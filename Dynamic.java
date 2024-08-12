import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic {
  public static void main(String[] args) {    
      LinkedList<Person> list = new LinkedList<>();
      list.add(new Person("Karthik", 21));
      list.add(new Person("Sai", 20));
    
      Iterator<Person> iterator = list.iterator();
      while (iterator.hasNext()) {
          Person person = iterator.next();
          System.out.println("Person Name: "+person.getName() + " Age: "+person.getAge());
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

  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }
}