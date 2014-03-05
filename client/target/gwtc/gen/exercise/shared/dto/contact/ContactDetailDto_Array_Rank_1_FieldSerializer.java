package exercise.shared.dto.contact;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ContactDetailDto_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, exercise.shared.dto.contact.ContactDetailDto[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static exercise.shared.dto.contact.ContactDetailDto[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new exercise.shared.dto.contact.ContactDetailDto[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, exercise.shared.dto.contact.ContactDetailDto[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return exercise.shared.dto.contact.ContactDetailDto_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    exercise.shared.dto.contact.ContactDetailDto_Array_Rank_1_FieldSerializer.deserialize(reader, (exercise.shared.dto.contact.ContactDetailDto[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    exercise.shared.dto.contact.ContactDetailDto_Array_Rank_1_FieldSerializer.serialize(writer, (exercise.shared.dto.contact.ContactDetailDto[])object);
  }
  
}
