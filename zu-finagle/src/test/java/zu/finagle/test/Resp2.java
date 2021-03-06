/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package zu.finagle.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class Resp2 implements TBase<Resp2, Resp2._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Resp2");

  private static final TField VALS_FIELD_DESC = new TField("vals", TType.SET, (short)1);

  public Set<Integer> vals;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    VALS((short)1, "vals");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VALS
          return VALS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALS, new FieldMetaData("vals", TFieldRequirementType.OPTIONAL, 
        new SetMetaData(TType.SET, 
            new FieldValueMetaData(TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Resp2.class, metaDataMap);
  }

  public Resp2() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Resp2(Resp2 other) {
    if (other.isSetVals()) {
      Set<Integer> __this__vals = new HashSet<Integer>();
      for (Integer other_element : other.vals) {
        __this__vals.add(other_element);
      }
      this.vals = __this__vals;
    }
  }

  public Resp2 deepCopy() {
    return new Resp2(this);
  }

  @Override
  public void clear() {
    this.vals = null;
  }

  public int getValsSize() {
    return (this.vals == null) ? 0 : this.vals.size();
  }

  public java.util.Iterator<Integer> getValsIterator() {
    return (this.vals == null) ? null : this.vals.iterator();
  }

  public void addToVals(int elem) {
    if (this.vals == null) {
      this.vals = new HashSet<Integer>();
    }
    this.vals.add(elem);
  }

  public Set<Integer> getVals() {
    return this.vals;
  }

  public Resp2 setVals(Set<Integer> vals) {
    this.vals = vals;
    return this;
  }

  public void unsetVals() {
    this.vals = null;
  }

  /** Returns true if field vals is set (has been asigned a value) and false otherwise */
  public boolean isSetVals() {
    return this.vals != null;
  }

  public void setValsIsSet(boolean value) {
    if (!value) {
      this.vals = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALS:
      if (value == null) {
        unsetVals();
      } else {
        setVals((Set<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALS:
      return getVals();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALS:
      return isSetVals();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Resp2)
      return this.equals((Resp2)that);
    return false;
  }

  public boolean equals(Resp2 that) {
    if (that == null)
      return false;

    boolean this_present_vals = true && this.isSetVals();
    boolean that_present_vals = true && that.isSetVals();
    if (this_present_vals || that_present_vals) {
      if (!(this_present_vals && that_present_vals))
        return false;
      if (!this.vals.equals(that.vals))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Resp2 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Resp2 typedOther = (Resp2)other;

    lastComparison = Boolean.valueOf(isSetVals()).compareTo(typedOther.isSetVals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVals()) {
      lastComparison = TBaseHelper.compareTo(this.vals, typedOther.vals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // VALS
          if (field.type == TType.SET) {
            {
              TSet _set0 = iprot.readSetBegin();
              this.vals = new HashSet<Integer>(2*_set0.size);
              for (int _i1 = 0; _i1 < _set0.size; ++_i1)
              {
                int _elem2;
                _elem2 = iprot.readI32();
                this.vals.add(_elem2);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.vals != null) {
      if (isSetVals()) {
        oprot.writeFieldBegin(VALS_FIELD_DESC);
        {
          oprot.writeSetBegin(new TSet(TType.I32, this.vals.size()));
          for (int _iter3 : this.vals)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Resp2(");
    boolean first = true;

    if (isSetVals()) {
      sb.append("vals:");
      if (this.vals == null) {
        sb.append("null");
      } else {
        sb.append(this.vals);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

