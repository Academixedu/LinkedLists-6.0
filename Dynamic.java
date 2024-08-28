import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop

    LinkedList<Person> l = new LinkedList<>();
    l.add(new Person(1,"Salaar", 100000.250));
    l.add(new Person(2,"Kalki", 200000.250));

    Iterator<Person> i = l.iterator();

    while (i.hasNext()) {
      System.out.println(i.next());
      
    }
  }
}
