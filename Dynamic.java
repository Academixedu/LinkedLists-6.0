import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<person> list = new LinkedList<person>();
    list.add(new person(24, "Vishal", "B+", "Male", "Delhi"));
    Iterator<person> itr = list.iterator();
    while(itr.hasNext())
      {
      System.out.println(itr.next());
      }
  }
}
