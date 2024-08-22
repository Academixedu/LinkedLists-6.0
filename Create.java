import java.util.LinkedList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> l=new LinkedList<>();    

// Head
// Iterator
l.add(25);
l.add(44);
l.add(2002);
Iterator i=l.iterator();
while(i.hasNext()){
    System.out.println(i.next());
}
}
}
