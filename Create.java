import java.util.*;
public class Create{

public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  int[]a=new int[4];
  List<Integer> l=new LinkedList<Integer>();
  l.add(1);
  l.add(2);
  l.add(3);
  l.add(4);
  Iterator i=l.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }

}
}
