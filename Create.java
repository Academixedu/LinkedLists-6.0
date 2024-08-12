import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Create
{
    void meth1()
    {
        System.out.println("Implementing LinkedList");
        LinkedList <Object> ll=new LinkedList<Object>();

        ll.add("Java");
        ll.add(10);
        ll.add(null);
        ll.add(0,20);
        ll.add('A');
        ll.add(56);
        ll.add(80);

        System.out.println("Retrieving the data by using Iterator interface");
        Iterator <Object> li=ll.iterator();

        System.out.println("Retrieving the data in forward direction");

        while (li.hasNext()) 
        {
          System.out.print(li.next()+ " ");
        }
        System.out.println();
       
    }


public static void main(String[]args)
{
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator

  new Create().meth1();
}
}
