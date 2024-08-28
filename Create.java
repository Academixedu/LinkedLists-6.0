import java.util.*;
public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  List<Integer> b=new LinkedList<Integer>();
  b.add(221);
  b.add(258);
  b.add(212);
  b.add(5);
  b.add(3);
 
  Iterator n=b.iterator();
  while (n.hasNext()) {
      System.out.println(n.next());
      
  }
  

}

}


