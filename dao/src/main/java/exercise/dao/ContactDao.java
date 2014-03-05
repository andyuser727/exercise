package exercise.dao;

import exercise.domain.Contact;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactDao extends GenericDaoImpl<Contact> {

    public ContactDao() {
        super(Contact.class);
    }

    public List<Contact> searchContacts(String forename, String surname,
                                        String street, String city,
                                        String county, String country,
                                        String postalCode) {
        Criteria criteria = sf.getCurrentSession().createCriteria(Contact.class);
        if (forename != null) {
            criteria.add(Restrictions.ilike("forename", "%" + forename + "%"));
        }
        if (surname != null) {
            criteria.add(Restrictions.ilike("surname", "%" + surname + "%"));
        }
        if (street != null) {
            criteria.add(Restrictions.ilike("street", "%" + street + "%"));
        }
        if (city != null) {
            criteria.add(Restrictions.ilike("city", "%" + city + "%"));
        }
        if (county != null) {
            criteria.add(Restrictions.ilike("county", "%" + county + "%"));
        }
        if (country != null) {
            criteria.add(Restrictions.ilike("country", "%" + country + "%"));
        }
        if (postalCode != null) {
            criteria.add(Restrictions.ilike("postalCode", "%" + postalCode + "%"));
        }
        return criteria.list();
    }

}