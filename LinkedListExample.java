import java.util.Iterator;
import java.util.NoSuchElementException;

// Person class
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// LinkedList class
class LinkedList<T> implements Iterable<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    public void add(T value) {
        if (head == null) {
            head = new Node<>(value);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(value);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;
            @Override
            public boolean hasNext() { return current != null; }
            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}

// Main class
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Charlie", 35));

        // Iterate using for-each loop
        for (Person person : list) {
            System.out.println(person);
        }
    }
}

