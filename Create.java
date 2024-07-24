import java.util.LinkedList;

import java.util.Iterator;
public class Create{
public static void main(String[]args){
  LinkedList<Integer> a=new LinkedList<Integer>();
  a.add(1);
  a.add(2);
  a.add(3);
  a.add(4);
  System.out.println(a);
  System.out.println("using iterator");
  Iterator it=a.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }

}
}
