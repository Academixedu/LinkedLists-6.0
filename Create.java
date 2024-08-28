import java.util.LinkedList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){

        LinkedList<String> list = new LinkedList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
