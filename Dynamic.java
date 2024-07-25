
import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<persons> list = new LinkedList<persons>();
    persons p1 = new persons("siva", 24, "Delhi", "Male");
    persons p2 = new persons("shiva", 21, "kkd", "Male");
    list.add(p1);
    list.add(p2);
    Iterator load=list.listIterator();
    while(load.hasNext())
    {
      System.out.println(load.next());

  }
}}

    
