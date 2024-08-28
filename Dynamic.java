import java.util.*;
public class Dynamic{
  public static void main(String[]args){
    
    // create an Object for LinkedList
      // add person objects in it
      // iterate that List using iterator
      // print it by using while loop
      List<person> l=new LinkedList<>();
      l.add(new person (23,"bhanu"));
      Iterator<person> iterator=l.iterator();
      while(iterator.hasNext()){
        person p=iterator.next();
        System.out.println("age"+p.getAge());
        System.out.println("name"+p.getName());
      }
    }
  }