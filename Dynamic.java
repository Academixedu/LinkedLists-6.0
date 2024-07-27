package selfPractise;

import java.util.LinkedList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop

    LinkedList<Person2> p2 = new LinkedList<>();
    p2.add(new Person2(null, false, 0));
    p2.add(new Person2(null, true, 009878f));
    p2.add(new Person2(null, false, -758f));
    p2.add(new Person2(null, false, 09875f));


    Iterator it = p2.iterator();
    while (it.hasNext()) {
      System.out.println(it.next()+" ");
    }
  }
}
