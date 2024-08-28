public class person1 {
    
    private  int sid;
    private  String personname;
    private  char salary;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getPersonname() {
        return personname;
    }
    public void setPersonname(String personname) {
        this.personname = personname;
    }
    public char getSalary() {
        return salary;
    }
    public void setSalary(char salary) {
        this.salary = salary;
    }
    public person1(int sid, String personname, char salary) {
        this.sid = sid;
        this.personname = personname;
        this.salary = salary;
    }
    public person1() {
    }
    @Override
    public String toString() {
        return "person1 [sid=" + sid + ", personname=" + personname + ", salary=" + salary + ", getSid()=" + getSid()+  "]";
    }
    

}
