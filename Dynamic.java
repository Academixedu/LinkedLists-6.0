import java.util.LinkedList;
import java.util.Iterator;

public class prac{
    public static void main(String[]args)
      {
      // create an Object for LinkedList
        // add person objects in it
        // iterate that List using iterator
        // print it by using while loop
        LinkedList<Integer> person=new LinkedList<>();
        person.add(23);
        person.add(4767);
        person.add(676);
        Iterator i=person.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }


      }
    }
