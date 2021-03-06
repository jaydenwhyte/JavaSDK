/*
 * Copyright (C) 2017 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.sdk.margin;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.ImmutableConstructor;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.impl.direct.DirectPrivateBeanBuilder;

/**
 * General-purpose error message object.
 */
@BeanDefinition(builderScope = "private", metaScope = "private")
public final class ErrorMessage implements ImmutableBean {

  /**
   * The HTTP status code.
   */
  @PropertyDefinition
  private final int status;

  /**
   * The error reason.
   */
  @PropertyDefinition(validate = "notNull")
  private final String reason;

  /**
   * The service error message.
   */
  @PropertyDefinition(validate = "notNull")
  private final String message;

  /**
   * The optional error type, such as an exception class name.
   */
  @PropertyDefinition
  private final String type;

  //-------------------------------------------------------------------------
  /**
   * Obtains an instance.
   *
   * @param status  the status
   * @param reason  the reason
   * @param message  the message
   * @return the instance
   */
  public static ErrorMessage of(int status, String reason, String message) {
    return new ErrorMessage(status, reason, message, null);
  }

  /**
   * Obtains an instance.
   *
   * @param status  the status
   * @param reason  the reason
   * @param message  the message
   * @param type  the type
   * @return the instance
   */
  public static ErrorMessage of(int status, String reason, String message, String type) {
    return new ErrorMessage(status, reason, message, type);
  }

  @ImmutableConstructor
  private ErrorMessage(int status, String reason, String message, String type) {
    this.status = status;
    this.reason = reason == null ? "" : reason;
    this.message = message == null ? "" : message;
    this.type = type;
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code ErrorMessage}.
   * @return the meta-bean, not null
   */
  public static MetaBean meta() {
    return ErrorMessage.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(ErrorMessage.Meta.INSTANCE);
  }

  @Override
  public MetaBean metaBean() {
    return ErrorMessage.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the HTTP status code.
   * @return the value of the property
   */
  public int getStatus() {
    return status;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the error reason.
   * @return the value of the property, not null
   */
  public String getReason() {
    return reason;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the service error message.
   * @return the value of the property, not null
   */
  public String getMessage() {
    return message;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the optional error type, such as an exception class name.
   * @return the value of the property
   */
  public String getType() {
    return type;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      ErrorMessage other = (ErrorMessage) obj;
      return (status == other.status) &&
          JodaBeanUtils.equal(reason, other.reason) &&
          JodaBeanUtils.equal(message, other.message) &&
          JodaBeanUtils.equal(type, other.type);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(status);
    hash = hash * 31 + JodaBeanUtils.hashCode(reason);
    hash = hash * 31 + JodaBeanUtils.hashCode(message);
    hash = hash * 31 + JodaBeanUtils.hashCode(type);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(160);
    buf.append("ErrorMessage{");
    buf.append("status").append('=').append(status).append(',').append(' ');
    buf.append("reason").append('=').append(reason).append(',').append(' ');
    buf.append("message").append('=').append(message).append(',').append(' ');
    buf.append("type").append('=').append(JodaBeanUtils.toString(type));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ErrorMessage}.
   */
  private static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code status} property.
     */
    private final MetaProperty<Integer> status = DirectMetaProperty.ofImmutable(
        this, "status", ErrorMessage.class, Integer.TYPE);
    /**
     * The meta-property for the {@code reason} property.
     */
    private final MetaProperty<String> reason = DirectMetaProperty.ofImmutable(
        this, "reason", ErrorMessage.class, String.class);
    /**
     * The meta-property for the {@code message} property.
     */
    private final MetaProperty<String> message = DirectMetaProperty.ofImmutable(
        this, "message", ErrorMessage.class, String.class);
    /**
     * The meta-property for the {@code type} property.
     */
    private final MetaProperty<String> type = DirectMetaProperty.ofImmutable(
        this, "type", ErrorMessage.class, String.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "status",
        "reason",
        "message",
        "type");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          return status;
        case -934964668:  // reason
          return reason;
        case 954925063:  // message
          return message;
        case 3575610:  // type
          return type;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends ErrorMessage> builder() {
      return new ErrorMessage.Builder();
    }

    @Override
    public Class<? extends ErrorMessage> beanType() {
      return ErrorMessage.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          return ((ErrorMessage) bean).getStatus();
        case -934964668:  // reason
          return ((ErrorMessage) bean).getReason();
        case 954925063:  // message
          return ((ErrorMessage) bean).getMessage();
        case 3575610:  // type
          return ((ErrorMessage) bean).getType();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code ErrorMessage}.
   */
  private static final class Builder extends DirectPrivateBeanBuilder<ErrorMessage> {

    private int status;
    private String reason;
    private String message;
    private String type;

    /**
     * Restricted constructor.
     */
    private Builder() {
      super(meta());
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          return status;
        case -934964668:  // reason
          return reason;
        case 954925063:  // message
          return message;
        case 3575610:  // type
          return type;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          this.status = (Integer) newValue;
          break;
        case -934964668:  // reason
          this.reason = (String) newValue;
          break;
        case 954925063:  // message
          this.message = (String) newValue;
          break;
        case 3575610:  // type
          this.type = (String) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public ErrorMessage build() {
      return new ErrorMessage(
          status,
          reason,
          message,
          type);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(160);
      buf.append("ErrorMessage.Builder{");
      buf.append("status").append('=').append(JodaBeanUtils.toString(status)).append(',').append(' ');
      buf.append("reason").append('=').append(JodaBeanUtils.toString(reason)).append(',').append(' ');
      buf.append("message").append('=').append(JodaBeanUtils.toString(message)).append(',').append(' ');
      buf.append("type").append('=').append(JodaBeanUtils.toString(type));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
