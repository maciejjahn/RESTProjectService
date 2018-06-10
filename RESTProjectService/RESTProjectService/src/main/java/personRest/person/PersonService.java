package personRest.person;

import org.springframework.stereotype.Service;
import personRest.uuid.uuid;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    List<Person> personList = new ArrayList<Person>();

    public PersonService()
    {
        personList.add(new Person(1, "Maciej", "Jahn", "MJ", "12354"));
        personList.add(new Person(2, "Krzysztof", "Ibisz", "chriss22", "cj144"));
        personList.add(new Person(3, "Bartłomiej", "Weglicki", "byniu", "haslogaslo"));
    }


    public boolean checkUUID(uuid UUID)
    {
        for (Person p : personList)
        {
            if (p.getUUID().getHash().equals(UUID.getHash()))
            return true;
        }
            return false;
    }

    public Person checkLogin(String username, String password)
    {
        Person temp = null;
        for (Person p : personList)
        {
            if (p.getUsername().equals(username))
            {
                temp = p;
                break;
            }
        }
        if (temp.checkPassword(password))
            return temp;
        else
            return null;
    }

    public Person getPerson(int user)
    {
        for (Person p : personList) {
            if (p.getId() == user) {
                return p;
            }
        }
        return null;
    }

    public List<Person> getAllPersons()
    {
        return personList;
    }

    public void addPerson(Person person)
    {
        personList.add(person);
    }

    public void deletePerson(int user)
    {
        for(Person p : personList)
        {
            if (p.getId() == user)
            {
                personList.remove(p);
                return;
            }
        }
        return;
    }
}

