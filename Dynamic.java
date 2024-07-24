import java.util.LinkedList;

import java.util.Iterator;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
  LinkedList<Person1> al = new LinkedList<Person1>();

    // add person objects in it
    Person1 p = new Person1(12, "prasad", "vizag", 25000);
    al.add(p);
    al.add(new Person1(13, "sai", "vijayawada", 35000));
    // iterate that List using iterator
    Iterator<Person1> i = al.listIterator();
    // print it by using while loop
    while(i.hasNext())
    {
      System.out.println(i.next());
    }
  }
}
