import java.util.LinkedList;
import java.util.Iterator;

public class prac{
    public static void main(String[]args){
    // create a Linked List Object
      // Add Values
      // iterate it by using For Each
       LinkedList<Integer> s=new LinkedList<>();
       s.add(9);
       s.add(02);
       s.add(02);
       Iterator i=s.iterator();
       for(Integer e:s){
        System.out.println(e);

       }

    }
}
