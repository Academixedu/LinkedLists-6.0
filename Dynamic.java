import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class Dynamic{
public static void main(String[]args){

  LinkedList<person> a = new LinkedList<person>();
a.add(new person(1,"srrk"));

  Iterator<person> i = a.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());
} 
}
}