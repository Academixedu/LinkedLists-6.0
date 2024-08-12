import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
  public static void main(String[] args) {
    // Create an Object for LinkedList
    LinkedList<Person> p = new LinkedList<>();

    // Add Person objects to the list
    p.add(new Person("Goutham", 25));
    p.add(new Person("fayaz", 30));
    p.add(new Person("karthik", 22));

    // Iterate through the list using an iterator
    Iterator<Person> i = p.iterator();

    // Print the elements using a while loop
    while (i.hasNext()) {
        Person person = i.next();
        System.out.println(person);
    }
}
}

class Person {
private String name;
private int age;

public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

@Override
public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
}
}
