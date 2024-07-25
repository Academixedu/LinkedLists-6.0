import java.util.LinkedList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop

   LinkedList<Person> personlist=new LinkedList<>();
   personlist.add(new Person("Kashifa",21));
   personlist.add(new Person("Wasifa",23));

   Iterator<Person> it=personlist.iterator();
   while(it.hasNext()){
    System.out.println(it.next());
   }

  }
}
