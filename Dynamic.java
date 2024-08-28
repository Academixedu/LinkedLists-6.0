import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Dynamic{
public static void main(String[]args)
  {
    List <person1>k=new LinkedList<person1>();
  
  k.add(new person1(1, "Rohit", 3465));
  k.add(new person1(1, "mohit", 321456));
  k.add(new person1(1, "nanda", 786578426));
  k.add(new person1(1, "surendra", 326745765));

   Iterator<person1> l=k.iterator();
   while (l.hasNext()) {
    System.out.println(l.next());
    
   }
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
  }
}
