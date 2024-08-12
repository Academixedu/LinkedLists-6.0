import java.util.LinkedList;
import java.util.Iterator;

// Define the Person class
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Dynamic {
    public static void main(String[] args) {
       
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Alice", 30));
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}
