
import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
LinkedList<Integer> obj=new LinkedList<>();

  // Add Values in it
obj.add(1);
obj.add(2);
obj.add(3);
obj.add(4);
  // Iterate it by using Iterator
  Iterator a=obj.iterator();
  while(a.hasNext()){
    System.out.println(a.next());
  }
}
}
