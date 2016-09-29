/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class BeginDownloadResult implements org.apache.thrift.TBase<BeginDownloadResult, BeginDownloadResult._Fields>, java.io.Serializable, Cloneable, Comparable<BeginDownloadResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BeginDownloadResult");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("session", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("data_size", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BeginDownloadResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BeginDownloadResultTupleSchemeFactory());
  }

  private long version; // required
  private String session; // required
  private long data_size; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION((short)1, "version"),
    SESSION((short)2, "session"),
    DATA_SIZE((short)3, "data_size");

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
        case 1: // VERSION
          return VERSION;
        case 2: // SESSION
          return SESSION;
        case 3: // DATA_SIZE
          return DATA_SIZE;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __DATA_SIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DATA_SIZE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SESSION, new org.apache.thrift.meta_data.FieldMetaData("session", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA_SIZE, new org.apache.thrift.meta_data.FieldMetaData("data_size", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BeginDownloadResult.class, metaDataMap);
  }

  public BeginDownloadResult() {
  }

  public BeginDownloadResult(
    long version,
    String session)
  {
    this();
    this.version = version;
    set_version_isSet(true);
    this.session = session;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BeginDownloadResult(BeginDownloadResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    if (other.is_set_session()) {
      this.session = other.session;
    }
    this.data_size = other.data_size;
  }

  public BeginDownloadResult deepCopy() {
    return new BeginDownloadResult(this);
  }

  @Override
  public void clear() {
    set_version_isSet(false);
    this.version = 0;
    this.session = null;
    set_data_size_isSet(false);
    this.data_size = 0;
  }

  public long get_version() {
    return this.version;
  }

  public void set_version(long version) {
    this.version = version;
    set_version_isSet(true);
  }

  public void unset_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean is_set_version() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void set_version_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public String get_session() {
    return this.session;
  }

  public void set_session(String session) {
    this.session = session;
  }

  public void unset_session() {
    this.session = null;
  }

  /** Returns true if field session is set (has been assigned a value) and false otherwise */
  public boolean is_set_session() {
    return this.session != null;
  }

  public void set_session_isSet(boolean value) {
    if (!value) {
      this.session = null;
    }
  }

  public long get_data_size() {
    return this.data_size;
  }

  public void set_data_size(long data_size) {
    this.data_size = data_size;
    set_data_size_isSet(true);
  }

  public void unset_data_size() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATA_SIZE_ISSET_ID);
  }

  /** Returns true if field data_size is set (has been assigned a value) and false otherwise */
  public boolean is_set_data_size() {
    return EncodingUtils.testBit(__isset_bitfield, __DATA_SIZE_ISSET_ID);
  }

  public void set_data_size_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATA_SIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unset_version();
      } else {
        set_version((Long)value);
      }
      break;

    case SESSION:
      if (value == null) {
        unset_session();
      } else {
        set_session((String)value);
      }
      break;

    case DATA_SIZE:
      if (value == null) {
        unset_data_size();
      } else {
        set_data_size((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return get_version();

    case SESSION:
      return get_session();

    case DATA_SIZE:
      return get_data_size();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return is_set_version();
    case SESSION:
      return is_set_session();
    case DATA_SIZE:
      return is_set_data_size();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BeginDownloadResult)
      return this.equals((BeginDownloadResult)that);
    return false;
  }

  public boolean equals(BeginDownloadResult that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_session = true && this.is_set_session();
    boolean that_present_session = true && that.is_set_session();
    if (this_present_session || that_present_session) {
      if (!(this_present_session && that_present_session))
        return false;
      if (!this.session.equals(that.session))
        return false;
    }

    boolean this_present_data_size = true && this.is_set_data_size();
    boolean that_present_data_size = true && that.is_set_data_size();
    if (this_present_data_size || that_present_data_size) {
      if (!(this_present_data_size && that_present_data_size))
        return false;
      if (this.data_size != that.data_size)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_version = true;
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_session = true && (is_set_session());
    list.add(present_session);
    if (present_session)
      list.add(session);

    boolean present_data_size = true && (is_set_data_size());
    list.add(present_data_size);
    if (present_data_size)
      list.add(data_size);

    return list.hashCode();
  }

  @Override
  public int compareTo(BeginDownloadResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_version()).compareTo(other.is_set_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_session()).compareTo(other.is_set_session());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_session()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.session, other.session);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_data_size()).compareTo(other.is_set_data_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_data_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_size, other.data_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BeginDownloadResult(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("session:");
    if (this.session == null) {
      sb.append("null");
    } else {
      sb.append(this.session);
    }
    first = false;
    if (is_set_data_size()) {
      if (!first) sb.append(", ");
      sb.append("data_size:");
      sb.append(this.data_size);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' is unset! Struct:" + toString());
    }

    if (!is_set_session()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'session' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BeginDownloadResultStandardSchemeFactory implements SchemeFactory {
    public BeginDownloadResultStandardScheme getScheme() {
      return new BeginDownloadResultStandardScheme();
    }
  }

  private static class BeginDownloadResultStandardScheme extends StandardScheme<BeginDownloadResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.set_version_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.session = iprot.readString();
              struct.set_session_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.data_size = iprot.readI64();
              struct.set_data_size_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI64(struct.version);
      oprot.writeFieldEnd();
      if (struct.session != null) {
        oprot.writeFieldBegin(SESSION_FIELD_DESC);
        oprot.writeString(struct.session);
        oprot.writeFieldEnd();
      }
      if (struct.is_set_data_size()) {
        oprot.writeFieldBegin(DATA_SIZE_FIELD_DESC);
        oprot.writeI64(struct.data_size);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BeginDownloadResultTupleSchemeFactory implements SchemeFactory {
    public BeginDownloadResultTupleScheme getScheme() {
      return new BeginDownloadResultTupleScheme();
    }
  }

  private static class BeginDownloadResultTupleScheme extends TupleScheme<BeginDownloadResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.version);
      oprot.writeString(struct.session);
      BitSet optionals = new BitSet();
      if (struct.is_set_data_size()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_data_size()) {
        oprot.writeI64(struct.data_size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.version = iprot.readI64();
      struct.set_version_isSet(true);
      struct.session = iprot.readString();
      struct.set_session_isSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.data_size = iprot.readI64();
        struct.set_data_size_isSet(true);
      }
    }
  }

}

