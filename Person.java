public class Person
{
    String name;
    int sal;
    int age ;



    public Person(String name, int sal, int age) 
    {
        this.name = name;
        this.sal = sal;
        this.age = age;
    }
    @Override
    
    public String toString()
    {
        return name+" "+sal+" "+age;
    }   

}
