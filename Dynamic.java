import java.util.*;
class person {
    private String name;
    private int age;

    public void setname(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + age;
    }
}

public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
        LinkedList<person> ls = new LinkedList<person>();
        person ps = new person();
        ps.setname("hello", 23);
        ls.add(ps);
        Iterator it = ls.iterator();
        while (it.hasNext()) {
            person p = (person) it.next();
            System.out.println(p);
        }
  }
}
