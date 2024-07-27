package selfPractise;

import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    LinkedList<Short>sh = new LinkedList<>();
    sh.add((short)7989);
    for(int i=0;i<15;i++){
      if(i/3==0)
      sh.add((short)i);
      else
      {
        
      sh.add((short) i);
      }
    }
    sh.set((short)1, (short)7678);
    sh.add((short)-9987);
    for(int j:sh)
    System.out.println(j);
  }}
