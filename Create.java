import java.util.LinkedList;
import java.util.Iterator;


public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> a=new LinkedList<Integer>();
  a.add(1);
  a.add(2);
  Iterator it=a.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
}
}
