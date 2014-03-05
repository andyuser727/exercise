package exercise.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SimpleResponse_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.SimpleResponse instance) throws SerializationException {
    
  }
  
  public static exercise.shared.SimpleResponse instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.SimpleResponse();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.SimpleResponse instance) throws SerializationException {
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.SimpleResponse_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.SimpleResponse_FieldSerializer.deserialize(reader, (exercise.shared.SimpleResponse)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.SimpleResponse_FieldSerializer.serialize(writer, (exercise.shared.SimpleResponse)object);
  }
  
}
