import java
public class Dynamic{
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    List<person> v=new ArrayList<person>();
   
 v.add(new person(1 ,"arbaz",'f'));
   


// private List<person> v;
Iterator<person> k=v.iterator();
while(k.hasNext()){
  System.out.println(k.next());
}

}


  }

