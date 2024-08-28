import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
    ArrayList<person>w=new ArrayList<person>();
    person x=new person(12, "arbaz", 8768760987l, 5.8);
    w.add(x);
    Iterator<person>u=w.iterator();
    while (u.hasNext()) {
      System.out.println(u.next());
    }
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
  }
}
