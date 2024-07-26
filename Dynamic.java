import java.util.LinkedList;
import java.util.Iterator;

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Id: " + id;
    }
}

public class Dynamic {
    public static void main(String[] args) {
        LinkedList<Person> p = new LinkedList<>();

        p.add(new Person("Mourya", 61));
 p.add(new Person("Mani charan", 74));
  p.add(new Person("Ruthwik", 103));
  p.add(new Person("Bhuvan", 116));
        Iterator<Person> iterator = p.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
