package exercise.shared.dto.contact;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ContactDetailDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCity(exercise.shared.dto.contact.ContactDetailDto instance) /*-{
    return instance.@exercise.shared.dto.contact.ContactDetailDto::city;
  }-*/;
  
  private static native void setCity(exercise.shared.dto.contact.ContactDetailDto instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.dto.contact.ContactDetailDto::city = value;
  }-*/;
  
  private static native java.lang.String getCountry(exercise.shared.dto.contact.ContactDetailDto instance) /*-{
    return instance.@exercise.shared.dto.contact.ContactDetailDto::country;
  }-*/;
  
  private static native void setCountry(exercise.shared.dto.contact.ContactDetailDto instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.dto.contact.ContactDetailDto::country = value;
  }-*/;
  
  private static native java.lang.String getCounty(exercise.shared.dto.contact.ContactDetailDto instance) /*-{
    return instance.@exercise.shared.dto.contact.ContactDetailDto::county;
  }-*/;
  
  private static native void setCounty(exercise.shared.dto.contact.ContactDetailDto instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.dto.contact.ContactDetailDto::county = value;
  }-*/;
  
  private static native java.lang.String getForename(exercise.shared.dto.contact.ContactDetailDto instance) /*-{
    return instance.@exercise.shared.dto.contact.ContactDetailDto::forename;
  }-*/;
  
  private static native void setForename(exercise.shared.dto.contact.ContactDetailDto instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.dto.contact.ContactDetailDto::forename = value;
  }-*/;
  
  private static native java.lang.String getPostalCode(exercise.shared.dto.contact.ContactDetailDto instance) /*-{
    return instance.@exercise.shared.dto.contact.ContactDetailDto::postalCode;
  }-*/;
  
  private static native void setPostalCode(exercise.shared.dto.contact.ContactDetailDto instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.dto.contact.ContactDetailDto::postalCode = value;
  }-*/;
  
  private static native java.lang.String getStreet(exercise.shared.dto.contact.ContactDetailDto instance) /*-{
    return instance.@exercise.shared.dto.contact.ContactDetailDto::street;
  }-*/;
  
  private static native void setStreet(exercise.shared.dto.contact.ContactDetailDto instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.dto.contact.ContactDetailDto::street = value;
  }-*/;
  
  private static native java.lang.String getSurname(exercise.shared.dto.contact.ContactDetailDto instance) /*-{
    return instance.@exercise.shared.dto.contact.ContactDetailDto::surname;
  }-*/;
  
  private static native void setSurname(exercise.shared.dto.contact.ContactDetailDto instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.dto.contact.ContactDetailDto::surname = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.dto.contact.ContactDetailDto instance) throws SerializationException {
    setCity(instance, streamReader.readString());
    setCountry(instance, streamReader.readString());
    setCounty(instance, streamReader.readString());
    setForename(instance, streamReader.readString());
    setPostalCode(instance, streamReader.readString());
    setStreet(instance, streamReader.readString());
    setSurname(instance, streamReader.readString());
    
    exercise.shared.dto.RpcDto_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static exercise.shared.dto.contact.ContactDetailDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.dto.contact.ContactDetailDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.dto.contact.ContactDetailDto instance) throws SerializationException {
    streamWriter.writeString(getCity(instance));
    streamWriter.writeString(getCountry(instance));
    streamWriter.writeString(getCounty(instance));
    streamWriter.writeString(getForename(instance));
    streamWriter.writeString(getPostalCode(instance));
    streamWriter.writeString(getStreet(instance));
    streamWriter.writeString(getSurname(instance));
    
    exercise.shared.dto.RpcDto_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.dto.contact.ContactDetailDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.dto.contact.ContactDetailDto_FieldSerializer.deserialize(reader, (exercise.shared.dto.contact.ContactDetailDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.dto.contact.ContactDetailDto_FieldSerializer.serialize(writer, (exercise.shared.dto.contact.ContactDetailDto)object);
  }
  
}
