import java.util.List;

/**
 * Created by lddaniild on 18.09.14.
 */
public interface ContactsService {
    void addContact(Contact contact, ContactsDAOImpl contactsDAOInstance);
    void deleteContact(Contact contact, ContactsDAOImpl contactsDAOInstance);
    List<Contact> getAllContacts(ContactsDAOImpl contactsDAOInstance);
    void clearAll(ContactsDAOImpl contactsDAOInstance);
}
