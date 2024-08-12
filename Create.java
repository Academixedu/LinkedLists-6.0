import java.util.LinkedList;
import java.util.Iterator;



public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> l=new LinkedList<>();    


l.add(23);
l.add(12);
l.add(6);
Iterator i=l.iterator();
while(i.hasNext()){
    System.out.println(i.next());
}

}   
}




