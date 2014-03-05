package exercise.service.contact;

import exercise.dao.ContactDao;
import exercise.domain.Contact;
import exercise.shared.commands.LoadContactList;
import exercise.shared.dto.contact.ContactDetailDto;
import exercise.service.Handler;
import exercise.shared.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
@Component
@Transactional
public class LoadContactListService implements Handler<LoadContactList> {

    @Autowired
    ContactDao contactDao;

    public AppResponse execute(LoadContactList dto) throws IllegalArgumentException {

        AppResponse response = new AppResponse();

        List<Contact> contacts = contactDao.findAll();

        List<ContactDetailDto> contactDetailDtos = new ArrayList<ContactDetailDto>();
        for (Contact contact : contacts){
            ContactDetailDto contactDetailDto = new ContactDetailDto();
            contactDetailDto.setId(contact.getId());
            contactDetailDto.setCity(contact.getCity());
            contactDetailDto.setCountry(contact.getCountry());
            contactDetailDto.setForename(contact.getForename());
            contactDetailDto.setStreet(contact.getStreet());
            contactDetailDto.setSurname(contact.getSurname());
            contactDetailDto.setPostalCode(contact.getPostalCode());
            contactDetailDto.setCounty(contact.getCounty());

            contactDetailDtos.add(contactDetailDto);
        }
        response.setDtos(contactDetailDtos);

        return response;
    }

    public Class getIncomingCommandClass(){
        return LoadContactList.class;
    }


}

