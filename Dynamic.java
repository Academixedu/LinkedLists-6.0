import java.util.*;
class person {
    // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    private String name;
    private int id;

    public void setname(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + id;
    }
}

public class Dynamic{
public static void main(String[]args)
  {

        LinkedList<person> l = new LinkedList<person>();
        person p = new person();
        ps.setname("mello", 2);
        ls.add(p);
        Iterator t = ls.iterator();
        while (t.hasNext()) {
            person p2 = (person) t.next();
            System.out.println(p2);
        }
  }
}