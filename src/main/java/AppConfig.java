import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Илья on 21.09.2014.
 */
@Configuration
public class AppConfig {

    @Bean
    public Contact contact1(){
        Contact contact1 = new Contact();
        contact1.setFirstName("Ilya");
        contact1.setSecondName("Shinkarenko");
        contact1.setEmail("dsf@dsfd.ds");
        return contact1;
    }
    @Bean
    public Contact contact2(){
        Contact contact2 = new Contact();
        contact2.setFirstName("Daniil");
        contact2.setSecondName("Dudarev");
        contact2.setEmail("as@sda.as");
        return contact2;
    }

    @Bean
    public ContactsDAOImpl contactsDAO(){
        ContactsDAOImpl contactsDAO = new ContactsDAOImpl();
        List<Contact> list = new ArrayList<Contact>();
        list.add(contact1());
        list.add(contact2());
        
        contactsDAO.getListOfContacts();
        return contactsDAO;

    }

}
