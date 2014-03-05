package exercise.shared.dto.contact;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ContactListDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.dto.contact.ContactListDto instance) throws SerializationException {
    instance.contactDetailDtoList = (java.util.List) streamReader.readObject();
    
    exercise.shared.dto.RpcDto_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static exercise.shared.dto.contact.ContactListDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new exercise.shared.dto.contact.ContactListDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.dto.contact.ContactListDto instance) throws SerializationException {
    streamWriter.writeObject(instance.contactDetailDtoList);
    
    exercise.shared.dto.RpcDto_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.dto.contact.ContactListDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.dto.contact.ContactListDto_FieldSerializer.deserialize(reader, (exercise.shared.dto.contact.ContactListDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.dto.contact.ContactListDto_FieldSerializer.serialize(writer, (exercise.shared.dto.contact.ContactListDto)object);
  }
  
}
