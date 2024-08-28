import java.util.*;
public class Dynamic{
public static void main(String[]args) {
    List<Person> l=new LinkedList<>();
    l.add(new Person(20, "V Revathi", 'F'));
    Iterator<Person> iterator =l.iterator();
    while(iterator.hasNext()){
      Person p=iterator.next();
      System.out.println("Age: "+p.getAge());
      System.out.println("Name: "+p.getName());
      System.out.println("Gender: "+p.getGen());
    }
  }
}
