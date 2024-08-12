import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(30);
    list.add(20);
    for(Integer integer:list){
      System.out.println(integer);
    }
  }
}
