import java.util.LinkedList;

import java.util.Iterator;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
  LinkedList<String> al = new LinkedList<String>();
    // Add Values
    al.add("nani");
    al.add("sai");
    al.add("sri");
    al.add("satya");
    al.add("pavan");
    System.out.println("By using while loop");
    // Iterate it by using Iterator
    Iterator<String> i = al.listIterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    // iterate it by using For Each
    System.out.println("By using for each loop");
    for(String s : al){
      System.out.println(s);
    }
  }}
