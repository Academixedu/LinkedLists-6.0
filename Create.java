import java.util.LinkedList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
  LinkedList<String> a = new LinkedList<>();

  a.add("One");
  a.add("Two");
  a.add("Three");
  a.add("Four");
  
  Iterator<String> iterator = a.iterator();

 
  while (iterator.hasNext()) {
      
      System.out.println(iterator.next());
  }
}
}
