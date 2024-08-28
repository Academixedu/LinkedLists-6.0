public class Person {
    private  String name;
    private String Gender;
    private int age;
    private String add;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add = add;
    }
    public Person(String name, String gender, int age, String add) {
        this.name = name;
        Gender = gender;
        this.age = age;
        this.add = add;
    }
    

}
