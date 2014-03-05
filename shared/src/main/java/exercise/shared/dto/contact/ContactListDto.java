package exercise.shared.dto.contact;

import exercise.shared.dto.RpcDto;

import java.util.List;

public class ContactListDto extends RpcDto {

    List<ContactDetailDto> contactDetailDtoList;

    public List<ContactDetailDto> getContactDetailDtoList() {
        return contactDetailDtoList;
    }

    public void setContactDetailDtoList(List<ContactDetailDto> contactDetailDtoList) {
        this.contactDetailDtoList = contactDetailDtoList;
    }
}
