
import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic_ll {
  public static void main(String[] args) {
    // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<Person_ll> list = new LinkedList<>();
    list.add(new Person_ll("chaitanya", 21));
    list.add(new Person_ll("chaitu", 20));
    Iterator<Person_ll> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
