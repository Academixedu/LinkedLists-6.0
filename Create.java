import java.util.LinkedList;
import java.util.Iterator;

public class prac{
    public static void main(String[]args){
    // create  a Linked List class object
      // Add Values in it
      // Iterate it by using Iterator
      LinkedList<Integer> s =new LinkedList<>();
      s.add(1);
      s.add(3);
      s.add(8);
      s.add(7673);
      Iterator i=s.iterator();
      while (i.hasNext()) {
        System.out.println(i.next());
        
      }




    }
    }
