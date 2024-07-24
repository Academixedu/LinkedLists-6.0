import java.util.LinkedList;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args)
  {
    LinkedList<Person> list=new LinkedList<Person>();
    list.add(new Person("Manoj",21,101));
    list.add(new Person("Krishna",22,102));
    list.add(new Person("Lakshman",23,103));
    Iterator<Person> it=list.iterator();
    
    while(it.hasNext()){
      System.out.println(it.next().toString());
    }

  
  }
}
