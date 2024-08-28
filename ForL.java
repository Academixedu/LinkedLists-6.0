package LinkedLists;

import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each

    LinkedList<Integer> list = new LinkedList<Integer>();
    for(int i = 1; i <= 10; i++){
        list.add(i);
    }

    for(int i : list){
        System.out.println(i);
    }

  }}
