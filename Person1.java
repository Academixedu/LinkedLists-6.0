public class Person1 {
    private int pid;
    private String name;
    private String address;
    private int salary;
    public Person1(int pid, String name, String address, int salary) {
        this.pid = pid;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
    }
    
}
