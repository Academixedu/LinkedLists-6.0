
import java.util.LinkedList;
import java.util.Iterator;


public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator

  LinkedList <Object> list=new LinkedList();
 // LinkedList  list=new LinkedList();

  list.add(2);
  list.add("is");
  list.add(5);
  list.add(1,"linklist");
  list.add(2);

  Iterator <Object>i=list.iterator();

  while(i.hasNext()){
    System.out.println(i.next());
  }




}
}
