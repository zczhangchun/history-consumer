package com.zhangchun.history.consumer.model; /**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import com.xm4399.thrift.model.ItemTypeEnum;
import com.xm4399.thrift.model.UserTypeEnum;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.*;

public class GeneralHistoryLogOrigin implements org.apache.thrift.TBase<GeneralHistoryLogOrigin, GeneralHistoryLogOrigin._Fields>, java.io.Serializable, Cloneable {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GeneralHistoryLogOrigin");

    private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField USER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("userType", org.apache.thrift.protocol.TType.I32, (short)2);
    private static final org.apache.thrift.protocol.TField ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("itemId", org.apache.thrift.protocol.TType.STRING, (short)3);
    private static final org.apache.thrift.protocol.TField ITEM_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("itemType", org.apache.thrift.protocol.TType.I32, (short)4);
    private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)5);
    private static final org.apache.thrift.protocol.TField IS_FIRST_PLAY_FIELD_DESC = new org.apache.thrift.protocol.TField("isFirstPlay", org.apache.thrift.protocol.TType.I32, (short)6);
    private static final org.apache.thrift.protocol.TField IP_FIELD_DESC = new org.apache.thrift.protocol.TField("ip", org.apache.thrift.protocol.TType.STRING, (short)7);
    private static final org.apache.thrift.protocol.TField CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("channel", org.apache.thrift.protocol.TType.I32, (short)8);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class, new GeneralHistoryLogOriginStandardSchemeFactory());
        schemes.put(TupleScheme.class, new GeneralHistoryLogOriginTupleSchemeFactory());
    }

    public String userId; // required
    /**
     *
     * @see UserTypeEnum
     */
    public UserTypeEnum userType; // required
    public String itemId; // required
    /**
     *
     * @see ItemTypeEnum
     */
    public ItemTypeEnum itemType; // required
    public long timestamp; // required
    public int isFirstPlay; // required
    public String ip; // required
    public int channel; // optional

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        USER_ID((short)1, "userId"),
        /**
         *
         * @see UserTypeEnum
         */
        USER_TYPE((short)2, "userType"),
        ITEM_ID((short)3, "itemId"),
        /**
         *
         * @see ItemTypeEnum
         */
        ITEM_TYPE((short)4, "itemType"),
        TIMESTAMP((short)5, "timestamp"),
        IS_FIRST_PLAY((short)6, "isFirstPlay"),
        IP((short)7, "ip"),
        CHANNEL((short)8, "channel");

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
                case 1: // USER_ID
                    return USER_ID;
                case 2: // USER_TYPE
                    return USER_TYPE;
                case 3: // ITEM_ID
                    return ITEM_ID;
                case 4: // ITEM_TYPE
                    return ITEM_TYPE;
                case 5: // TIMESTAMP
                    return TIMESTAMP;
                case 6: // IS_FIRST_PLAY
                    return IS_FIRST_PLAY;
                case 7: // IP
                    return IP;
                case 8: // CHANNEL
                    return CHANNEL;
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
    private static final int __TIMESTAMP_ISSET_ID = 0;
    private static final int __ISFIRSTPLAY_ISSET_ID = 1;
    private static final int __CHANNEL_ISSET_ID = 2;
    private BitSet __isset_bit_vector = new BitSet(3);
    private _Fields optionals[] = {_Fields.CHANNEL};
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.USER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("userType", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, UserTypeEnum.class)));
        tmpMap.put(_Fields.ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("itemId", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ITEM_TYPE, new org.apache.thrift.meta_data.FieldMetaData("itemType", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ItemTypeEnum.class)));
        tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.IS_FIRST_PLAY, new org.apache.thrift.meta_data.FieldMetaData("isFirstPlay", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.IP, new org.apache.thrift.meta_data.FieldMetaData("ip", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("channel", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GeneralHistoryLogOrigin.class, metaDataMap);
    }

    public GeneralHistoryLogOrigin() {
        this.ip = "";

    }

    public GeneralHistoryLogOrigin(
            String userId,
            UserTypeEnum userType,
            String itemId,
            ItemTypeEnum itemType,
            long timestamp,
            int isFirstPlay,
            String ip)
    {
        this();
        this.userId = userId;
        this.userType = userType;
        this.itemId = itemId;
        this.itemType = itemType;
        this.timestamp = timestamp;
        setTimestampIsSet(true);
        this.isFirstPlay = isFirstPlay;
        setIsFirstPlayIsSet(true);
        this.ip = ip;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public GeneralHistoryLogOrigin(GeneralHistoryLogOrigin other) {
        __isset_bit_vector.clear();
        __isset_bit_vector.or(other.__isset_bit_vector);
        if (other.isSetUserId()) {
            this.userId = other.userId;
        }
        if (other.isSetUserType()) {
            this.userType = other.userType;
        }
        if (other.isSetItemId()) {
            this.itemId = other.itemId;
        }
        if (other.isSetItemType()) {
            this.itemType = other.itemType;
        }
        this.timestamp = other.timestamp;
        this.isFirstPlay = other.isFirstPlay;
        if (other.isSetIp()) {
            this.ip = other.ip;
        }
        this.channel = other.channel;
    }

    public GeneralHistoryLogOrigin deepCopy() {
        return new GeneralHistoryLogOrigin(this);
    }

    @Override
    public void clear() {
        this.userId = null;
        this.userType = null;
        this.itemId = null;
        this.itemType = null;
        setTimestampIsSet(false);
        this.timestamp = 0;
        setIsFirstPlayIsSet(false);
        this.isFirstPlay = 0;
        this.ip = "";

        setChannelIsSet(false);
        this.channel = 0;
    }

    public String getUserId() {
        return this.userId;
    }

    public GeneralHistoryLogOrigin setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public void unsetUserId() {
        this.userId = null;
    }

    /** Returns true if field userId is set (has been assigned a value) and false otherwise */
    public boolean isSetUserId() {
        return this.userId != null;
    }

    public void setUserIdIsSet(boolean value) {
        if (!value) {
            this.userId = null;
        }
    }

    /**
     *
     * @see UserTypeEnum
     */
    public UserTypeEnum getUserType() {
        return this.userType;
    }

    /**
     *
     * @see UserTypeEnum
     */
    public GeneralHistoryLogOrigin setUserType(UserTypeEnum userType) {
        this.userType = userType;
        return this;
    }

    public void unsetUserType() {
        this.userType = null;
    }

    /** Returns true if field userType is set (has been assigned a value) and false otherwise */
    public boolean isSetUserType() {
        return this.userType != null;
    }

    public void setUserTypeIsSet(boolean value) {
        if (!value) {
            this.userType = null;
        }
    }

    public String getItemId() {
        return this.itemId;
    }

    public GeneralHistoryLogOrigin setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public void unsetItemId() {
        this.itemId = null;
    }

    /** Returns true if field itemId is set (has been assigned a value) and false otherwise */
    public boolean isSetItemId() {
        return this.itemId != null;
    }

    public void setItemIdIsSet(boolean value) {
        if (!value) {
            this.itemId = null;
        }
    }

    /**
     *
     * @see ItemTypeEnum
     */
    public ItemTypeEnum getItemType() {
        return this.itemType;
    }

    /**
     *
     * @see ItemTypeEnum
     */
    public GeneralHistoryLogOrigin setItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
        return this;
    }

    public void unsetItemType() {
        this.itemType = null;
    }

    /** Returns true if field itemType is set (has been assigned a value) and false otherwise */
    public boolean isSetItemType() {
        return this.itemType != null;
    }

    public void setItemTypeIsSet(boolean value) {
        if (!value) {
            this.itemType = null;
        }
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public GeneralHistoryLogOrigin setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        setTimestampIsSet(true);
        return this;
    }

    public void unsetTimestamp() {
        __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
    }

    /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
    public boolean isSetTimestamp() {
        return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
    }

    public void setTimestampIsSet(boolean value) {
        __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
    }

    public int getIsFirstPlay() {
        return this.isFirstPlay;
    }

    public GeneralHistoryLogOrigin setIsFirstPlay(int isFirstPlay) {
        this.isFirstPlay = isFirstPlay;
        setIsFirstPlayIsSet(true);
        return this;
    }

    public void unsetIsFirstPlay() {
        __isset_bit_vector.clear(__ISFIRSTPLAY_ISSET_ID);
    }

    /** Returns true if field isFirstPlay is set (has been assigned a value) and false otherwise */
    public boolean isSetIsFirstPlay() {
        return __isset_bit_vector.get(__ISFIRSTPLAY_ISSET_ID);
    }

    public void setIsFirstPlayIsSet(boolean value) {
        __isset_bit_vector.set(__ISFIRSTPLAY_ISSET_ID, value);
    }

    public String getIp() {
        return this.ip;
    }

    public GeneralHistoryLogOrigin setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public void unsetIp() {
        this.ip = null;
    }

    /** Returns true if field ip is set (has been assigned a value) and false otherwise */
    public boolean isSetIp() {
        return this.ip != null;
    }

    public void setIpIsSet(boolean value) {
        if (!value) {
            this.ip = null;
        }
    }

    public int getChannel() {
        return this.channel;
    }

    public GeneralHistoryLogOrigin setChannel(int channel) {
        this.channel = channel;
        setChannelIsSet(true);
        return this;
    }

    public void unsetChannel() {
        __isset_bit_vector.clear(__CHANNEL_ISSET_ID);
    }

    /** Returns true if field channel is set (has been assigned a value) and false otherwise */
    public boolean isSetChannel() {
        return __isset_bit_vector.get(__CHANNEL_ISSET_ID);
    }

    public void setChannelIsSet(boolean value) {
        __isset_bit_vector.set(__CHANNEL_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case USER_ID:
                if (value == null) {
                    unsetUserId();
                } else {
                    setUserId((String)value);
                }
                break;

            case USER_TYPE:
                if (value == null) {
                    unsetUserType();
                } else {
                    setUserType((UserTypeEnum)value);
                }
                break;

            case ITEM_ID:
                if (value == null) {
                    unsetItemId();
                } else {
                    setItemId((String)value);
                }
                break;

            case ITEM_TYPE:
                if (value == null) {
                    unsetItemType();
                } else {
                    setItemType((ItemTypeEnum)value);
                }
                break;

            case TIMESTAMP:
                if (value == null) {
                    unsetTimestamp();
                } else {
                    setTimestamp((Long)value);
                }
                break;

            case IS_FIRST_PLAY:
                if (value == null) {
                    unsetIsFirstPlay();
                } else {
                    setIsFirstPlay((Integer)value);
                }
                break;

            case IP:
                if (value == null) {
                    unsetIp();
                } else {
                    setIp((String)value);
                }
                break;

            case CHANNEL:
                if (value == null) {
                    unsetChannel();
                } else {
                    setChannel((Integer)value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case USER_ID:
                return getUserId();

            case USER_TYPE:
                return getUserType();

            case ITEM_ID:
                return getItemId();

            case ITEM_TYPE:
                return getItemType();

            case TIMESTAMP:
                return Long.valueOf(getTimestamp());

            case IS_FIRST_PLAY:
                return Integer.valueOf(getIsFirstPlay());

            case IP:
                return getIp();

            case CHANNEL:
                return Integer.valueOf(getChannel());

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case USER_ID:
                return isSetUserId();
            case USER_TYPE:
                return isSetUserType();
            case ITEM_ID:
                return isSetItemId();
            case ITEM_TYPE:
                return isSetItemType();
            case TIMESTAMP:
                return isSetTimestamp();
            case IS_FIRST_PLAY:
                return isSetIsFirstPlay();
            case IP:
                return isSetIp();
            case CHANNEL:
                return isSetChannel();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof GeneralHistoryLogOrigin)
            return this.equals((GeneralHistoryLogOrigin)that);
        return false;
    }

    public boolean equals(GeneralHistoryLogOrigin that) {
        if (that == null)
            return false;

        boolean this_present_userId = true && this.isSetUserId();
        boolean that_present_userId = true && that.isSetUserId();
        if (this_present_userId || that_present_userId) {
            if (!(this_present_userId && that_present_userId))
                return false;
            if (!this.userId.equals(that.userId))
                return false;
        }

        boolean this_present_userType = true && this.isSetUserType();
        boolean that_present_userType = true && that.isSetUserType();
        if (this_present_userType || that_present_userType) {
            if (!(this_present_userType && that_present_userType))
                return false;
            if (!this.userType.equals(that.userType))
                return false;
        }

        boolean this_present_itemId = true && this.isSetItemId();
        boolean that_present_itemId = true && that.isSetItemId();
        if (this_present_itemId || that_present_itemId) {
            if (!(this_present_itemId && that_present_itemId))
                return false;
            if (!this.itemId.equals(that.itemId))
                return false;
        }

        boolean this_present_itemType = true && this.isSetItemType();
        boolean that_present_itemType = true && that.isSetItemType();
        if (this_present_itemType || that_present_itemType) {
            if (!(this_present_itemType && that_present_itemType))
                return false;
            if (!this.itemType.equals(that.itemType))
                return false;
        }

        boolean this_present_timestamp = true;
        boolean that_present_timestamp = true;
        if (this_present_timestamp || that_present_timestamp) {
            if (!(this_present_timestamp && that_present_timestamp))
                return false;
            if (this.timestamp != that.timestamp)
                return false;
        }

        boolean this_present_isFirstPlay = true;
        boolean that_present_isFirstPlay = true;
        if (this_present_isFirstPlay || that_present_isFirstPlay) {
            if (!(this_present_isFirstPlay && that_present_isFirstPlay))
                return false;
            if (this.isFirstPlay != that.isFirstPlay)
                return false;
        }

        boolean this_present_ip = true && this.isSetIp();
        boolean that_present_ip = true && that.isSetIp();
        if (this_present_ip || that_present_ip) {
            if (!(this_present_ip && that_present_ip))
                return false;
            if (!this.ip.equals(that.ip))
                return false;
        }

        boolean this_present_channel = true && this.isSetChannel();
        boolean that_present_channel = true && that.isSetChannel();
        if (this_present_channel || that_present_channel) {
            if (!(this_present_channel && that_present_channel))
                return false;
            if (this.channel != that.channel)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int compareTo(GeneralHistoryLogOrigin other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        GeneralHistoryLogOrigin typedOther = (GeneralHistoryLogOrigin)other;

        lastComparison = Boolean.valueOf(isSetUserId()).compareTo(typedOther.isSetUserId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUserId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, typedOther.userId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetUserType()).compareTo(typedOther.isSetUserType());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUserType()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userType, typedOther.userType);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetItemId()).compareTo(typedOther.isSetItemId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetItemId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemId, typedOther.itemId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetItemType()).compareTo(typedOther.isSetItemType());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetItemType()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemType, typedOther.itemType);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetTimestamp()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetIsFirstPlay()).compareTo(typedOther.isSetIsFirstPlay());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetIsFirstPlay()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isFirstPlay, typedOther.isFirstPlay);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetIp()).compareTo(typedOther.isSetIp());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetIp()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ip, typedOther.ip);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetChannel()).compareTo(typedOther.isSetChannel());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetChannel()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channel, typedOther.channel);
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
        StringBuilder sb = new StringBuilder("GeneralHistoryLogOrigin(");
        boolean first = true;

        sb.append("userId:");
        if (this.userId == null) {
            sb.append("null");
        } else {
            sb.append(this.userId);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("userType:");
        if (this.userType == null) {
            sb.append("null");
        } else {
            sb.append(this.userType);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("itemId:");
        if (this.itemId == null) {
            sb.append("null");
        } else {
            sb.append(this.itemId);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("itemType:");
        if (this.itemType == null) {
            sb.append("null");
        } else {
            sb.append(this.itemType);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("timestamp:");
        sb.append(this.timestamp);
        first = false;
        if (!first) sb.append(", ");
        sb.append("isFirstPlay:");
        sb.append(this.isFirstPlay);
        first = false;
        if (!first) sb.append(", ");
        sb.append("ip:");
        if (this.ip == null) {
            sb.append("null");
        } else {
            sb.append(this.ip);
        }
        first = false;
        if (isSetChannel()) {
            if (!first) sb.append(", ");
            sb.append("channel:");
            sb.append(this.channel);
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if (userId == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not present! Struct: " + toString());
        }
        if (userType == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'userType' was not present! Struct: " + toString());
        }
        if (itemId == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'itemId' was not present! Struct: " + toString());
        }
        if (itemType == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'itemType' was not present! Struct: " + toString());
        }
        // alas, we cannot check 'timestamp' because it's a primitive and you chose the non-beans generator.
        // alas, we cannot check 'isFirstPlay' because it's a primitive and you chose the non-beans generator.
        if (ip == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'ip' was not present! Struct: " + toString());
        }
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
            __isset_bit_vector = new BitSet(1);
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class GeneralHistoryLogOriginStandardSchemeFactory implements SchemeFactory {
        public GeneralHistoryLogOriginStandardScheme getScheme() {
            return new GeneralHistoryLogOriginStandardScheme();
        }
    }

    private static class GeneralHistoryLogOriginStandardScheme extends StandardScheme<GeneralHistoryLogOrigin> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, GeneralHistoryLogOrigin struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // USER_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.userId = iprot.readString();
                            struct.setUserIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // USER_TYPE
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.userType = UserTypeEnum.findByValue(iprot.readI32());
                            struct.setUserTypeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // ITEM_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.itemId = iprot.readString();
                            struct.setItemIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // ITEM_TYPE
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.itemType = ItemTypeEnum.findByValue(iprot.readI32());
                            struct.setItemTypeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // TIMESTAMP
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.timestamp = iprot.readI64();
                            struct.setTimestampIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 6: // IS_FIRST_PLAY
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.isFirstPlay = iprot.readI32();
                            struct.setIsFirstPlayIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 7: // IP
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.ip = iprot.readString();
                            struct.setIpIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 8: // CHANNEL
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.channel = iprot.readI32();
                            struct.setChannelIsSet(true);
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

            // check for required fields of primitive type, which can't be checked in the validate method
            if (!struct.isSetTimestamp()) {
                throw new org.apache.thrift.protocol.TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetIsFirstPlay()) {
                throw new org.apache.thrift.protocol.TProtocolException("Required field 'isFirstPlay' was not found in serialized data! Struct: " + toString());
            }
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, GeneralHistoryLogOrigin struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.userId != null) {
                oprot.writeFieldBegin(USER_ID_FIELD_DESC);
                oprot.writeString(struct.userId);
                oprot.writeFieldEnd();
            }
            if (struct.userType != null) {
                oprot.writeFieldBegin(USER_TYPE_FIELD_DESC);
                oprot.writeI32(struct.userType.getValue());
                oprot.writeFieldEnd();
            }
            if (struct.itemId != null) {
                oprot.writeFieldBegin(ITEM_ID_FIELD_DESC);
                oprot.writeString(struct.itemId);
                oprot.writeFieldEnd();
            }
            if (struct.itemType != null) {
                oprot.writeFieldBegin(ITEM_TYPE_FIELD_DESC);
                oprot.writeI32(struct.itemType.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
            oprot.writeI64(struct.timestamp);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(IS_FIRST_PLAY_FIELD_DESC);
            oprot.writeI32(struct.isFirstPlay);
            oprot.writeFieldEnd();
            if (struct.ip != null) {
                oprot.writeFieldBegin(IP_FIELD_DESC);
                oprot.writeString(struct.ip);
                oprot.writeFieldEnd();
            }
            if (struct.isSetChannel()) {
                oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
                oprot.writeI32(struct.channel);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class GeneralHistoryLogOriginTupleSchemeFactory implements SchemeFactory {
        public GeneralHistoryLogOriginTupleScheme getScheme() {
            return new GeneralHistoryLogOriginTupleScheme();
        }
    }

    private static class GeneralHistoryLogOriginTupleScheme extends TupleScheme<GeneralHistoryLogOrigin> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, GeneralHistoryLogOrigin struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            oprot.writeString(struct.userId);
            oprot.writeI32(struct.userType.getValue());
            oprot.writeString(struct.itemId);
            oprot.writeI32(struct.itemType.getValue());
            oprot.writeI64(struct.timestamp);
            oprot.writeI32(struct.isFirstPlay);
            oprot.writeString(struct.ip);
            BitSet optionals = new BitSet();
            if (struct.isSetChannel()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetChannel()) {
                oprot.writeI32(struct.channel);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, GeneralHistoryLogOrigin struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            struct.userId = iprot.readString();
            struct.setUserIdIsSet(true);
            struct.userType = UserTypeEnum.findByValue(iprot.readI32());
            struct.setUserTypeIsSet(true);
            struct.itemId = iprot.readString();
            struct.setItemIdIsSet(true);
            struct.itemType = ItemTypeEnum.findByValue(iprot.readI32());
            struct.setItemTypeIsSet(true);
            struct.timestamp = iprot.readI64();
            struct.setTimestampIsSet(true);
            struct.isFirstPlay = iprot.readI32();
            struct.setIsFirstPlayIsSet(true);
            struct.ip = iprot.readString();
            struct.setIpIsSet(true);
            BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                struct.channel = iprot.readI32();
                struct.setChannelIsSet(true);
            }
        }
    }

}
