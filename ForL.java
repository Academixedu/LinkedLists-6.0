import java.util.LinkedList;
import java.util.Scanner;

public class ForL {
  LinkedList<Long> l = new LinkedList<>();
 
  public void insert(long mobile) {
   
      l.add(mobile);
      System.out.println(l);
    }
  public static void main(String[] args) {
    ForL forL = new ForL();
    Scanner sc = new Scanner(System.in);

    // Adding Values
    forL.insert(8967543560L);
    forL.insert(7652349082L);
    forL.insert(6793245685L);

    // Iterating over the list using For Each
    for (Long mobile : forL.l) {
      System.out.println(mobile);
    }

    sc.close();
  }
}
