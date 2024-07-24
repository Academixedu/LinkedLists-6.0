
import java.util.LinkedList;
import java.util.Scanner;

public class ForL_ll {
  public static void main(String[] args) {
    // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    LinkedList<Integer> list = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      list.add(sc.nextInt());
    }
    for (Integer Lists : list) {
      System.out.println(Lists);
    }
  }
}
