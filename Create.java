import java.util.*;
public class Create{
private static final AbstractSequentialList<String> S = null;
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<String> S= new LinkedList<String>();
  
  S.add("apple");
  S.add("banana");
  S.add("mango");
  System.out.println(S);

Iterator<String> iterator =S.iterator();

  while(iterator.hasNext()){
    String fruit=iterator.next();
System.out.println(fruit);

  }
}


}



