import java.util.Iterator;
import java.util.LinkedList;

public class Dynamic
{
    void meth()
    {
      System.out.println("Implemeting LinkedList");

      LinkedList <Person> ll= new LinkedList<>();

      Person obj1=new Person("Abhishek", 100000, 22);
      Person obj2=new Person("Sarvesh", 130000, 22);
     
      //passing an argument to LinkList
      ll.add(obj1);
      ll.add(obj2);
      ll.add(new Person("Ratan",300000,22));

      System.out.println("-----------------------------");

      Iterator <Person> i=ll.iterator();

      while (i.hasNext())
       {
          System.out.println(i.next());
      }
      

    }



  public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop

    new Dynamic().meth();    
  }
}
