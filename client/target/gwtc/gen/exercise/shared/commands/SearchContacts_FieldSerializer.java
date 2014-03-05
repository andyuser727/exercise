package exercise.shared.commands;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SearchContacts_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCity(exercise.shared.commands.SearchContacts instance) /*-{
    return instance.@exercise.shared.commands.SearchContacts::city;
  }-*/;
  
  private static native void setCity(exercise.shared.commands.SearchContacts instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.commands.SearchContacts::city = value;
  }-*/;
  
  private static native java.lang.String getCountry(exercise.shared.commands.SearchContacts instance) /*-{
    return instance.@exercise.shared.commands.SearchContacts::country;
  }-*/;
  
  private static native void setCountry(exercise.shared.commands.SearchContacts instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.commands.SearchContacts::country = value;
  }-*/;
  
  private static native java.lang.String getCounty(exercise.shared.commands.SearchContacts instance) /*-{
    return instance.@exercise.shared.commands.SearchContacts::county;
  }-*/;
  
  private static native void setCounty(exercise.shared.commands.SearchContacts instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.commands.SearchContacts::county = value;
  }-*/;
  
  private static native java.lang.String getForename(exercise.shared.commands.SearchContacts instance) /*-{
    return instance.@exercise.shared.commands.SearchContacts::forename;
  }-*/;
  
  private static native void setForename(exercise.shared.commands.SearchContacts instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.commands.SearchContacts::forename = value;
  }-*/;
  
  private static native java.lang.String getPostalCode(exercise.shared.commands.SearchContacts instance) /*-{
    return instance.@exercise.shared.commands.SearchContacts::postalCode;
  }-*/;
  
  private static native void setPostalCode(exercise.shared.commands.SearchContacts instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.commands.SearchContacts::postalCode = value;
  }-*/;
  
  private static native java.lang.String getStreet(exercise.shared.commands.SearchContacts instance) /*-{
    return instance.@exercise.shared.commands.SearchContacts::street;
  }-*/;
  
  private static native void setStreet(exercise.shared.commands.SearchContacts instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.commands.SearchContacts::street = value;
  }-*/;
  
  private static native java.lang.String getSurname(exercise.shared.commands.SearchContacts instance) /*-{
    return instance.@exercise.shared.commands.SearchContacts::surname;
  }-*/;
  
  private static native void setSurname(exercise.shared.commands.SearchContacts instance, java.lang.String value) 
  /*-{
    instance.@exercise.shared.commands.SearchContacts::surname = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.commands.SearchContacts instance) throws SerializationException {
    setCity(instance, streamReader.readString());
    setCountry(instance, streamReader.readString());
    setCounty(instance, streamReader.readString());
    setForename(instance, streamReader.readString());
    setPostalCode(instance, streamReader.readString());
    setStreet(instance, streamReader.readString());
    setSurname(instance, streamReader.readString());
    
    exercise.shared.dto.RpcDto_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static exercise.shared.commands.SearchContacts instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.commands.SearchContacts();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.commands.SearchContacts instance) throws SerializationException {
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
    return exercise.shared.commands.SearchContacts_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.commands.SearchContacts_FieldSerializer.deserialize(reader, (exercise.shared.commands.SearchContacts)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.commands.SearchContacts_FieldSerializer.serialize(writer, (exercise.shared.commands.SearchContacts)object);
  }
  
}
