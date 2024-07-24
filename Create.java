import java.util.LinkedList;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;
public class Create{
public static void main(String[]args){
// create  a Linked List class object
LinkedList<Integer>l= new LinkedList<Integer>();
  // Add Values in it
l.add(50);
l.add(40);
l.add(30);
l.add(20);
l.add(10);


  // Iterate it by using Iterator
  Iterator i=l.listIterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
