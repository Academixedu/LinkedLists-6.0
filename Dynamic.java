import java.util.Iterator;
import java.util.LinkedList;
class Person {
  String name;
  int age;

  // Constructor
  Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Method to display Person details
  void display() {
      System.out.println("Name is " + name + ", Age is: " + age);
  }
}
public class Dynamic{
  public void Person(String name,int age){
    System.out.println("name is :  "+name+ "age is :" +age);

  }
public static void main(String[]args)
  {
  // create an Object for LinkedList
  LinkedList<Person> personList = new LinkedList<>();
  personList.add(new Person("Alice", 30));
  personList.add(new Person("Bob", 25));
  personList.add(new Person("Charlie", 35));

    // add person objects in it
    // iterate that List using iterator
    Iterator<Person> iterator = personList.iterator();
    while (iterator.hasNext()) {
     // Get the next Person object
     Person person = iterator.next();
     // Print Person details
     person.display();
 }
   


  
    }
}
