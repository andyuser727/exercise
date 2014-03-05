package exercise.client.mvp;

import com.google.gwt.place.impl.AbstractPlaceHistoryMapper;
import exercise.client.mvp.AppPlaceHistoryMapper;
import exercise.client.mvp.AppPlaceFactory;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.impl.AbstractPlaceHistoryMapper.PrefixAndToken;
import com.google.gwt.core.client.GWT;

public class AppPlaceHistoryMapperImpl extends AbstractPlaceHistoryMapper<AppPlaceFactory> implements AppPlaceHistoryMapper {
  
  protected PrefixAndToken getPrefixAndToken(Place newPlace) {
    if (newPlace instanceof exercise.client.place.ContactDetailPlace) {
      exercise.client.place.ContactDetailPlace place = (exercise.client.place.ContactDetailPlace) newPlace;
      return new PrefixAndToken("contact_detail", factory.getContactDetailPlaceTokenizer().getToken(place));
    }
    if (newPlace instanceof exercise.client.place.ContactListPlace) {
      exercise.client.place.ContactListPlace place = (exercise.client.place.ContactListPlace) newPlace;
      return new PrefixAndToken("contact_list", factory.getContactListPlaceTokenizer().getToken(place));
    }
    return null;
  }
  
  protected PlaceTokenizer<?> getTokenizer(String prefix) {
    if ("contact_detail".equals(prefix)) {
      return factory.getContactDetailPlaceTokenizer();
    }
    if ("contact_list".equals(prefix)) {
      return factory.getContactListPlaceTokenizer();
    }
    return null;
  }

}
