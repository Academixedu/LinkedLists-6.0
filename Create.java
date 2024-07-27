package selfPractise;

import java.util.*;


public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Boolean>bb = new LinkedList<>();
  bb.add(true);
  for(int i=0;i<10;i++)
  {
    if(i%2==0)
    bb.add(true);
    else
    bb.add(false);
  }
  Iterator it = bb.iterator();
  while ((it.hasNext())) {
    System.out.println(it.next());
  }
  
}
}
