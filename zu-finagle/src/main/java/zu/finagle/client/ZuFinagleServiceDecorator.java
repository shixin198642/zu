package zu.finagle.client;

import java.net.InetSocketAddress;
import java.util.Set;

import scala.runtime.BoxedUnit;
import zu.core.cluster.routing.InetSocketAddressDecorator;

import com.twitter.finagle.Service;
import com.twitter.finagle.builder.ClientBuilder;
import com.twitter.finagle.thrift.ThriftClientFramedCodec;
import com.twitter.finagle.thrift.ThriftClientRequest;
import com.twitter.util.Duration;
import com.twitter.util.Future;

public class ZuFinagleServiceDecorator<Req, Res> implements InetSocketAddressDecorator<Service<Req,Res>>{
  private final Duration timeout;
  private final int numThreads;
  private final ZuClientProxy<Req, Res> svc;
  
  public ZuFinagleServiceDecorator(ZuClientProxy<Req, Res> svc) {
    this(svc, ZuClientFinagleServiceBuilder.DEFAULT_TIMEOUT_DURATION, ZuClientFinagleServiceBuilder.DEFAULT_NUM_THREADS);
  }
  
  public ZuFinagleServiceDecorator(ZuClientProxy<Req, Res> svc, Duration timeout, int numThreads){
    this.svc = svc;
    this.timeout = timeout;
    this.numThreads = numThreads;
  }
  
  @Override
  public Service<Req, Res> decorate(InetSocketAddress addr) {
    Service<ThriftClientRequest, byte[]> client = ClientBuilder.safeBuild(ClientBuilder.get().hosts(addr)
    .codec(ThriftClientFramedCodec.get())
    .requestTimeout(timeout)
    .hostConnectionLimit(numThreads));
    
    return svc.wrap(client);
  }

  @Override
  public void cleanup(Set<Service<Req, Res>> toBeClosed) {
    for (Service<Req,Res> svc : toBeClosed) {
      Future<BoxedUnit> closeFuture = svc.close();
      if (closeFuture != null) {
        closeFuture.apply();
      }
    }
  }

}
