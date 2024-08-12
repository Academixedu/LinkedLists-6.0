import java.util.LinkedList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// create  a Linked List class object
  LinkedList<Integer> li=new LinkedList<>();
  // Add Values in it
  li.add(1);
  li.add(2);
  li.add(3);
  li.add(4);
  // Iterate it by using Iterator
  Iterator i=li.iterator();
  while(i.hasNext()){
      System.out.println(i.next());
  }
}
}
