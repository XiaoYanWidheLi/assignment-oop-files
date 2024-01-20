package Task1;
import java.util.List;

public class Main{

    public static void main(String[] args){
        //ArrayList<Person> persons = new ArrayList<>(Storage.fetchPersons());
        List<Person> persons;
        persons = Storage.fetchPersons();
        Storage.save(persons);

        System.out.println(Persons.addperson());
        //System.out.println(persons);


        //persons.trimToSize();

    }
}
