package exercise.shared.commands;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SaveContactDetail_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.commands.SaveContactDetail instance) throws SerializationException {
    instance.contactDetailDto = (exercise.shared.dto.contact.ContactDetailDto) streamReader.readObject();
    
    exercise.shared.dto.RpcDto_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static exercise.shared.commands.SaveContactDetail instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.commands.SaveContactDetail();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.commands.SaveContactDetail instance) throws SerializationException {
    streamWriter.writeObject(instance.contactDetailDto);
    
    exercise.shared.dto.RpcDto_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.commands.SaveContactDetail_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.commands.SaveContactDetail_FieldSerializer.deserialize(reader, (exercise.shared.commands.SaveContactDetail)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.commands.SaveContactDetail_FieldSerializer.serialize(writer, (exercise.shared.commands.SaveContactDetail)object);
  }
  
}
