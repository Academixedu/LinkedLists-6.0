import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
  LinkedList<Integer> list = new LinkedList<>();
  list.add(10);
  list.add(30);
  list.add(20);

  Iterator<Integer> iterator=list.iterator();
  while(iterator.hasNext()){
    System.out.println(iterator.next());
  }
}
}
