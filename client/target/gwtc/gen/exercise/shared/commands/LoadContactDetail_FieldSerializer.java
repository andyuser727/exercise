package exercise.shared.commands;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LoadContactDetail_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.commands.LoadContactDetail instance) throws SerializationException {
    instance.contactId = (java.lang.Long) streamReader.readObject();
    
    exercise.shared.dto.RpcDto_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static exercise.shared.commands.LoadContactDetail instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.commands.LoadContactDetail();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.commands.LoadContactDetail instance) throws SerializationException {
    streamWriter.writeObject(instance.contactId);
    
    exercise.shared.dto.RpcDto_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.commands.LoadContactDetail_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.commands.LoadContactDetail_FieldSerializer.deserialize(reader, (exercise.shared.commands.LoadContactDetail)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.commands.LoadContactDetail_FieldSerializer.serialize(writer, (exercise.shared.commands.LoadContactDetail)object);
  }
  
}
