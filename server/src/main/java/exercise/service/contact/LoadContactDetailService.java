package exercise.service.contact;

import exercise.dao.ContactDao;
import exercise.domain.Contact;
import exercise.shared.commands.LoadContactDetail;
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
public class LoadContactDetailService implements Handler<LoadContactDetail> {

    @Autowired
    ContactDao contactDao;

    public AppResponse execute(LoadContactDetail dto) throws IllegalArgumentException {

        AppResponse response = new AppResponse();

        Contact contact = contactDao.find(dto.getContactId());
        ContactDetailDto contactDetailDto = new ContactDetailDto();
        contactDetailDto.setId(contact.getId());
        contactDetailDto.setCity(contact.getCity());
        contactDetailDto.setCountry(contact.getCountry());
        contactDetailDto.setForename(contact.getForename());
        contactDetailDto.setStreet(contact.getStreet());
        contactDetailDto.setSurname(contact.getSurname());
        contactDetailDto.setPostalCode(contact.getPostalCode());
        contactDetailDto.setCounty(contact.getCounty());

        List<ContactDetailDto> contactDetailDtos = new ArrayList<ContactDetailDto>();
        contactDetailDtos.add(contactDetailDto);
        response.setDtos(contactDetailDtos);

        return response;
    }

    public Class getIncomingCommandClass(){
        return LoadContactDetail.class;
    }


}

