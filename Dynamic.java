
import java.util.LinkedList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<Person> List = new LinkedList<Person>();
    List.add(new Person (1,"Togar"));
    List.add(new Person(2,"Naveen")); 
    Iterator<Person> i = List.iterator();
    while(i.hasNext()){
        System.out.println(i.next().toString());
    }
  }
}
