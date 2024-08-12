import java.util.LinkedList;
import java.util.Iterator;

public class Dynamic {
    public static void main(String[] args) {
        // Create a LinkedList to store Person objects
        LinkedList<Person> a= new LinkedList<>();

        // Add Person objects to the LinkedList
        a.add(new Person("fayaz", 30));
        a.add(new Person("sai", 25));
        a.add(new Person("karthik", 35));

        // Iterate over the list using an iterator
        Iterator<Person> i = a.iterator();
        while (i.hasNext()) {
            // Print each Person object
            System.out.println(i.next());
        }
    }
  }
    class Person {
      String name;
      int age;
  
      Person(String name, int age) {
          this.name = name;
          this.age = age;

      }
      public String toString() {
        return  name+age;
    }
  

  }
