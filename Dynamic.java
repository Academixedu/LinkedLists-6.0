import java.util.LinkedList;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<Person> list=new LinkedList<>();
    list.add(new Person("swapna",21));
    list.add(new Person("soppi",21));
    Iterator it =list.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
