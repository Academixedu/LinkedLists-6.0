import java.util.LinkedList;
import java.util.ListIterator;

public class Dynamic{
  String name;
  int age;
  String gender;

  public Dynamic(String name, int age, String gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
public static void main(String[]args)
  {
  // create an Object for LinkedList
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop

  LinkedList<Dynamic> p = new LinkedList<>();
  p.add(new Dynamic("sujatha", 21, "Female"));
  p.add(new Dynamic("sam", 20,"Male"));
  p.add(new Dynamic("sravya", 21,"Female"));

  ListIterator<Dynamic> iterator = p.listIterator();
  while (iterator.hasNext()) {
      Dynamic person = iterator.next();
      System.out.println("Name: " + person.name + ", Age: " + person.age + ", Gender: " + person.gender);
  }
  }
}
