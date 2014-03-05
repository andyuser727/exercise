package exercise.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RpcDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId(exercise.shared.dto.RpcDto instance) /*-{
    return instance.@exercise.shared.dto.RpcDto::id;
  }-*/;
  
  private static native void setId(exercise.shared.dto.RpcDto instance, java.lang.Long value) 
  /*-{
    instance.@exercise.shared.dto.RpcDto::id = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.dto.RpcDto instance) throws SerializationException {
    setId(instance, (java.lang.Long) streamReader.readObject());
    
  }
  
  public static exercise.shared.dto.RpcDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.dto.RpcDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.dto.RpcDto instance) throws SerializationException {
    streamWriter.writeObject(getId(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.dto.RpcDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.dto.RpcDto_FieldSerializer.deserialize(reader, (exercise.shared.dto.RpcDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.dto.RpcDto_FieldSerializer.serialize(writer, (exercise.shared.dto.RpcDto)object);
  }
  
}
