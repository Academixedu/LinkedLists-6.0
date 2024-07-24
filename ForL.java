import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class ForL{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> a=new LinkedList<Integer>();
  a.add(1);
  a.add(2);
  a.add(3);
  for(Integer i:a){
    System.out.println(i);
  }
}
}