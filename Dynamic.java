import java.util.LinkedList;

import java.util.Iterator;

public class Dynamic{
public static void main(String[]args)
  {
    LinkedList<Person> l=new LinkedList<Person>();
    Person p=new Person("prasad",56,89000);
    l.add(new Person("pratap",45,50000));
    l.add(p);
    Iterator i=l.listIterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
  }
}
