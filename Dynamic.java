import java.util.LinkedList;
import java.util.Iterator;

class Person {
  private String name;
  private int age;

  
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  
  @Override
  public String toString() {
      return "Name: " + name + ", Age: " + age;
  }
}
public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<Person> personList = new LinkedList<>();

        
    personList.add(new Person("Bhanu",24 ));
    personList.add(new Person("Manu", 22));
    personList.add(new Person("Balu", 22));

    
    Iterator<Person> iterator = personList.iterator();


    while (iterator.hasNext()) {
        
        System.out.println(iterator.next());
    }
}
}
