import java.util.LinkedList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
LinkedList<Integer> al = new LinkedList<Integer>();
  // Add Values in it
  al.add(10);
  al.add(20);
  al.add(30);
  al.add(40);
  al.add(50);
  // Iterate it by using Iterator
  Iterator<Integer>i=al.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
