
import java.util.Iterator;
import java.util.LinkedList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void display() {
        System.out.println( "Name: " + name + ", Age: " + age);
    }
}

public class Dynamic {
    public static void main(String[] args) {
        // Create a LinkedList to store Person objects
        LinkedList<Person> personList = new LinkedList<>();

        // Add Person objects to the LinkedList
        personList.add(new Person("Syam", 30));
        personList.add(new Person("Kumar", 25));
        personList.add(new Person("Nallamilli", 35));

        // Iterate through the LinkedList using an Iterator
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            // Print each Person object using the iterator
            Person person =iterator.next();
            person.display();
        }
    }
}
