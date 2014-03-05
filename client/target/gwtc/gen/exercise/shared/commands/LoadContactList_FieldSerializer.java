package exercise.shared.commands;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LoadContactList_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.commands.LoadContactList instance) throws SerializationException {
    
    exercise.shared.dto.RpcDto_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static exercise.shared.commands.LoadContactList instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.commands.LoadContactList();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.commands.LoadContactList instance) throws SerializationException {
    
    exercise.shared.dto.RpcDto_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.commands.LoadContactList_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.commands.LoadContactList_FieldSerializer.deserialize(reader, (exercise.shared.commands.LoadContactList)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.commands.LoadContactList_FieldSerializer.serialize(writer, (exercise.shared.commands.LoadContactList)object);
  }
  
}
