import java.util.ArrayList;
import java.util.List;

/**
 * Created by lddaniild on 18.09.14.
 */
public class ContactsDAOImpl implements ContactsDAO {

    private int maxSize;

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int getMaxSize(){
        return maxSize;
    }

    private List<Contact> listOfContacts; //= new ArrayList<Contact>();

    @Override
    public void setContact(Contact contact) {
        this.listOfContacts.add(contact);
    }

    @Override
    public void removeContact(Contact contact) {
        this.listOfContacts.remove(contact);
    }

    public List<Contact> getListOfContacts(){
        return listOfContacts;
    }

    public void setListOfContacts(List listOfContacts){
        if(listOfContacts.size()<=maxSize) {
            this.listOfContacts = listOfContacts;
        }
        else{
            int difference = listOfContacts.size()-maxSize;
            for(int i=0; i<difference; i++){
                listOfContacts.remove(listOfContacts.get(0));
            }
            this.listOfContacts = listOfContacts;
        }
    }

}
