import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator

    LinkedList<Integer> list = new LinkedList<Integer>();
    for(int i = 1; i <= 10; i++){
        list.add(i);
    }

    Iterator<Integer> it = list.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }

}
}
