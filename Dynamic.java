
import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
  LinkedList<String> p1=new LinkedList<>();
  LinkedList<Integer> p=new LinkedList<>();
    // add person objects in it
    p1.add("Swarupa");
    p1.add("Sujatha");
    p1.add("Kavitha");
    p1.add("Mahi");

    // iterate that List using iterator
    Iterator person=p1.iterator();

    // print it by using while loop
    while (person.hasNext()) {
        
        System.out.println(person.next());
    }
   
  }
}


