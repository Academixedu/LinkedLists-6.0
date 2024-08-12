
import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
  LinkedList<String> p1=new LinkedList<>();
  LinkedList<Integer> p=new LinkedList<>();
    // add person objects in it
    p1.add("Pavani");
    p1.add("Ganesh");
    p1.add("sankeerthana");
    p1.add("syam");

    // iterate that List using iterator
    Iterator person=p1.iterator();

    // print it by using while loop
    while (person.hasNext()) {

        System.out.println(person.next());
    }

  }
}