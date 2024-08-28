import java.util.*;
public class Dynamic{
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
public static void main(String[]args)
  {
    LinkedList<person1> p1=new LinkedList<person1>();
    p1.add(new person1("a",2));
    p1.add(new person1("b",3));
    Iterator<person1>iterator=p1.iterator();
    while(iterator.hasNext()){
      person1 person=iterator.next();
      System.out.println("Name: " +person.getName() + ", Age: " +person.getAge());
    }

  

  }
}
