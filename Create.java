import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator

  LinkedList<Integer> list = new LinkedList<>();
  list.add(5);
  list.add(9);
  list.add(4);

  Iterator<Integer> iterator = list.iterator();
  for(Integer i:list){
    System.out.println(i);
  }
}
}
