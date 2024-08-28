import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
  ArrayList<Integer>r=new ArrayList<Integer>();
  r.add(65);
  r.add(98);
  r.add(25);
  Iterator<Integer>e=r.iterator();
  while (e.hasNext()) {
    System.out.println(e.next()) ; 
  }
  
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
}
}
