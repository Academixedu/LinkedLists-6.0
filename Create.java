import java.util.*;
public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  List<Integer> ls=new LinkedList<Integer>();
  ls.add(1);
  ls.add(2);
  ls.add(8);
  Iterator it=ls.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
}
}
