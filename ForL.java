import java.util.*;
public class ForL{
  public static void main(String[]args){
    List<String> l=new LinkedList<String>();
    l.add("Apple");
    l.add("Mango");
    for(String fruit:l){
        System.out.println(fruit);
    }
  }
}
