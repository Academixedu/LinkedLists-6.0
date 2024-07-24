import java.util.LinkedList;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
  LinkedList<Person>l=new LinkedList<>();
    // add person objects in it
    Person p2=new Person("Gayathri",20,"Hyderabad","1234567890");
    l.add(p2);
    l.add(new Person("Sri",21,"Chennai","9876543210"));
    // iterate that List using iterator
    Iterator i=l.listIterator();
    // print it by using while loop
    while(i.hasNext())
    {
    System.out.println(i.next());
    }
  }
}
