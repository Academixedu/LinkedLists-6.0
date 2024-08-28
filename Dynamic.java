import java.util.*;
public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    List<person1> m=new ArrayList<person1>();
   
 m.add(new person1(1 ,"arbaz",'f'));
   


// private List<person> v;
Iterator<person1> n=m.iterator();
while(n.hasNext()){
  System.out.println(n.next());
}

}


  }

