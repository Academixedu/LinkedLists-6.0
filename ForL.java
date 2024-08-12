import java.util.LinkedList;

public class ForL
{

  void meth()
  {
      LinkedList <Object> ll=new LinkedList<>();

      ll.add("Java");
      ll.add("is");
      ll.add("Awesome");
      ll.add(0,10);
      ll.add(69);

    
      for (Object obj  :ll) 
      {
        System.out.print(obj+",");
      }
  }
  public static void main(String[]args)
  {
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
     new ForL().meth();
  }}
