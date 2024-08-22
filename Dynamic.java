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
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<Person> personList = new LinkedList<>();
    personList.add(new Person("Mani", 30));
    personList.add(new Person("Yogi", 25));
    personList.add(new Person("Jaggu", 35));


    Iterator<Person> iterator = personList.iterator();
    while (iterator.hasNext()) {
    
     Person person = iterator.next();
     
     person.display();
  }
}
}
