import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
         LinkedList<Person> p = new LinkedList<Person>();
    // add person objects in it

        Person p1 = new Person(10,"Srinadh", "Dev");
        p.push(p1);
    // iterate that List using iterator
        Iterator i = p.listIterator();
    // print it by using while loop
        while(i.hasNext()){
          System.out.println(i.next());
        }
  }
}
