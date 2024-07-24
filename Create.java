import java.util.LinkedList;

import java.util.Iterator;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> l=new LinkedList<Integer>();
  l.add(12);
  l.add(14);
  l.add(16);
  l.remove(2);
  l.add(18);
  Iterator i=l.iterator();
  while (i.hasNext()) {
    System.out.print(i.next()+"\t");
}
}
}
