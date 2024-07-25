import java.util.LinkedList;
import java.util.Iterator;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<person> list=new LinkedList<person>();
    list.add(new person("Sri", 21));
    list.add(new person("pavan", 22));
    list.add(new person("kumar", 23));
    Iterator<person> it=list.iterator();
    while(it.hasNext())
    {
    System.out.println(it.next());
    }
  }
}
