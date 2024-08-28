public class person1 {
    private int srno;
    private String name;
    private double salary;
    public int getSrno() {
        return srno;
    }
    public void setSrno(int srno) {
        this.srno = srno; 
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void Person1(int srno, String name, double salary) {
        this.srno = srno;
        this.name = name;
        this.salary = salary;
    }
   
    @Override
    public String toString() {
        return "Person [srno=" + srno + ", name=" + name + ", salary=" + salary + "]";
    }
}
