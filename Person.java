public class Person {
    private String name;
    private int age;
    private String address;
    private String mobilenumber;
    public Person(String name, int age, String address, String mobilenumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobilenumber = mobilenumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobilenumber() {
        return mobilenumber;
    }
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", address=" + address + ", mobilenumber=" + mobilenumber + "]";
    }
    
}
