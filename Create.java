import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
 LinkedList <Integer> linkedList=new LinkedList<>();
 linkedList.add(1);
 linkedList.add(2);
 linkedList.add(3);
 linkedList.add(4);
  @SuppressWarnings("rawtypes")
  Iterator i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

}
}
