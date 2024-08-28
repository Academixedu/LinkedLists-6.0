import java.util.LinkedList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> mylist=new LinkedList<Integer>();
  mylist.add(10);
  mylist.add(15);
  mylist.add(20);
  mylist.add(30);
  mylist.add(50);
  Iterator<Integer> it=mylist.iterator();
  while(it.hasNext()){
  System.out.println(it.next());
  }
}
}
