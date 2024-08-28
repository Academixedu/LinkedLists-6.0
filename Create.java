import java.util.*;

public class Create{
public static void main(String[]args){
  List <Integer>k=new LinkedList<Integer>();
  
  k.add(3);
  k.add(4);
  k.add(5);
  k.add(6);
  k.add(7);

  Iterator l=k.iterator();
   while (l.hasNext()) {
    System.out.println(l.next());
    
   }
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
}
}
