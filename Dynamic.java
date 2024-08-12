import java.util.LinkedList;
import java.util.Iterator;

public class Dynamic {
    public static void main(String[] args) {
      // Create a LinkedList of Person objects
      LinkedList<Person> list = new LinkedList<>();
      list.add(new Person("Kavitha", 21));
      // Iterate over the list using an iterator
      Iterator<Person> it = list.iterator();
      while (it.hasNext()) {
        // Print each Person object
        System.out.println(it.next());
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
        return "Name: " + name + ", Age: " + age;
    }
}

