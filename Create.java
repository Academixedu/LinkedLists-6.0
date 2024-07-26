import java.util.LinkedList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> list=new LinkedList<>();
  list.add(1);
  list.add(2);
  list.add(3);
  Iterator it = list.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }

}
}
