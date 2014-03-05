package exercise.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AppResponse_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getDtos(exercise.shared.AppResponse instance) /*-{
    return instance.@exercise.shared.AppResponse::dtos;
  }-*/;
  
  private static native void setDtos(exercise.shared.AppResponse instance, java.util.List value) 
  /*-{
    instance.@exercise.shared.AppResponse::dtos = value;
  }-*/;
  
  private static native java.util.ArrayList getValidationMessages(exercise.shared.AppResponse instance) /*-{
    return instance.@exercise.shared.AppResponse::validationMessages;
  }-*/;
  
  private static native void setValidationMessages(exercise.shared.AppResponse instance, java.util.ArrayList value) 
  /*-{
    instance.@exercise.shared.AppResponse::validationMessages = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.AppResponse instance) throws SerializationException {
    setDtos(instance, (java.util.List) streamReader.readObject());
    setValidationMessages(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static exercise.shared.AppResponse instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.AppResponse();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.AppResponse instance) throws SerializationException {
    streamWriter.writeObject(getDtos(instance));
    streamWriter.writeObject(getValidationMessages(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.AppResponse_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.AppResponse_FieldSerializer.deserialize(reader, (exercise.shared.AppResponse)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.AppResponse_FieldSerializer.serialize(writer, (exercise.shared.AppResponse)object);
  }
  
}
