import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    LinkedList<Person> dyna=new LinkedList<>();
    Person p1 = new Person("kumar", "male", 18, "hyd");
Person p2 = new Person("vino", "female", 17, "kphb");

dyna.add(p1);
dyna.add(p2);

Iterator <Person> it = dyna.iterator();
while (it.hasNext()) {
  Person p = it.next();
  System.out.println(p.getName());
  System.out.println(p.getAge());
  System.out.println(p.getGender());
  System.out.println(p.getAdd());
  
}


    }
}
