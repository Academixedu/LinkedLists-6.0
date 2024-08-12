import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<Person> a= new LinkedList<>();

   
    a.add(new Person("MAHESH", 30));
    a.add(new Person("sai", 25));
    

  
    Iterator<Person> i = a.iterator();
    while (i.hasNext()) {
      
        System.out.println(i.next());
    }
}
}
class Person {
  String name;
  int age;

  Person(String name, int age) {
      this.name = name;
      this.age = age;

  }
  public String toString() {
    return  name+age;
}
  }

