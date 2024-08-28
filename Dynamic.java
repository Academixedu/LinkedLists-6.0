import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<person>an = new LinkedList<person>();
    an.add(new person(1,"dinesh"));
    an.add(new person(2,"vijay"));
    Iterator<person> i = an.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
