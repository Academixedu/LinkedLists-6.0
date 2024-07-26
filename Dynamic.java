import java.util.LinkedList;
import java.util.Iterator;

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
}

 class LinkedListPersonExample {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();

        people.add(new Person("mohan", 20));
        people.add(new Person("krishna", 25));
        people.add(new Person("hari", 15));

        Iterator<Person> iterator = people.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
