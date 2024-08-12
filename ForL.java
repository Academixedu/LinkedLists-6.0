import java.util.Iterator;
import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each

    LinkedList <Object> list=new LinkedList();
 // LinkedList  list=new LinkedList();

  list.add(2);
  list.add("is");
  list.add(5);
  list.add(1,"linklist");
  list.add(2);

 for(Object a:list){

  System.out.println(a);

 }
 int size=list.size();
 System.out.println("the size pos link list :"+size);
 System.out.println(list.get(2));
  }
}



  
