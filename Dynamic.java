import java.util.LinkedList;
import java.util.Iterator;



public class Dynamic {
    public static void main(String[] args) {
        
        LinkedList<Person> personList = new LinkedList<>();

      
        personList.add(new Person("Ramesh", 55));
        personList.add(new Person("Suresh", 65));
        
       
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}
