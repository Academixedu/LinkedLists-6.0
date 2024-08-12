public class Person 
{
    String Name;
    String Adress;
    int age;
    int sal;
    public Person(String name, String adress, int age, int sal) {
        Name = name;
        Adress = adress;
        this.age = age;
        
        this.sal = sal;
    }

    @Override

    public String toString()
    {
        return Name+" "+Adress+" "+ " "+age +" "+ sal+" ";
    }

    
}
