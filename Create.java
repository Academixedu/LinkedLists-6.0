import java.util.*;
public class Create{
  public static void main(String[]args){
    int[]a=new int[5];
    List<Integer> l=new LinkedList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
    l.add(6);
    Iterator i=l.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}
