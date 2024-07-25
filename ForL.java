import java.util.LinkedList;


public class ForL
{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    LinkedList<Object> list = new LinkedList<Object>();
    list.add(1);
    list.add("Hello");
    list.add('s');
    list .add(true);
    list.add(5.6);

    for(Object load:list)
     { 
      System.out.println(load);
     }
  }}
