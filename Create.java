import java.util.*;
public class Create{

  public void meth()
  {
    System.out.println("Implementing List =>");
    LinkedList <Object>in=new LinkedList<Object>();
    in.add("Java");
    in.add(10);
    in.add(0, "First Index");
    in.add(null);
    in.add(50);
    in.add(25);

    System.out.println("Retrieving the data using Iterator interface => ");
    Iterator <Object>aobj=in.iterator();
    System.out.println("Retrieving the data in Forward Direction => ");
    while (aobj.hasNext()) 
    {
      System.out.println(aobj.next()); 
    }



  }
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  new Create().meth();

}
}
