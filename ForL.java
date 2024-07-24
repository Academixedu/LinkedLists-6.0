import java.util.LinkedList;
public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
  LinkedList<Object>l= new LinkedList<Object>();
    // Add Values
  l.add("Sri");
  l.add(1);
  l.add("Santhoshi");
  l.add(5);
  l.add("Janu");
    // iterate it by using For Each
  for(Object s:l){
    System.out.println(s);
  }
  }}
