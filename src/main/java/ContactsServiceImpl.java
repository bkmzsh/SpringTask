import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lddaniild on 18.09.14.
 */
public class ContactsServiceImpl implements ContactsService {


    private int maxSize;

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int getMaxSize(){
        return maxSize;
    }

    @Override
    public void addContact(Contact contact, ContactsDAOImpl contactsDAOInstance) {
        if (contactsDAOInstance.getListOfContacts().size()<=maxSize){
            contactsDAOInstance.setContact(contact);
        }
        else{
            this.deleteContact(contactsDAOInstance.getListOfContacts().get(0), contactsDAOInstance);
            contactsDAOInstance.setContact(contact);
        }
    }

    @Override
    public void deleteContact(Contact contact, ContactsDAOImpl contactsDAOInstance) {
        contactsDAOInstance.removeContact(contact);
    }

    @Override
    public List<Contact> getAllContacts(ContactsDAOImpl contactsDAOInstance) {
        return contactsDAOInstance.getListOfContacts();
    }

    @Override
    public void clearAll(ContactsDAOImpl contactsDAOInstance) {
        contactsDAOInstance.getListOfContacts().clear();
    }

}
