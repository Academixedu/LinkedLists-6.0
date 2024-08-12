import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    LinkedList <Object>ll=new LinkedList<>();
    ll.add("Java is Awesome");
    ll.add("Java is Good");
    ll.add(0,30);

    for (Object obj : ll) 
    {
      System.out.println(obj);  
    }
  }}
