import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic{
  public void meth1()
  {
    System.out.println("Implementing List =>");
    LinkedList <Person> ll=new LinkedList<>();
    Person obj1=new Person("Shreyash","Nagpur",22,100000);
    Person obj2=new Person("Ratan","Nagpur",22,10);

    ll.add(obj1);
    ll.add(obj2);
    ll.add(new Person("Sarvesh","Nagpur",22,5));

    Iterator <Person> it=ll.iterator();
    while (it.hasNext()) 
    {
     System.out.println(it.next()); 
    }


  }

public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    Dynamic aobj = new Dynamic();
    aobj.meth1();

  }
}
