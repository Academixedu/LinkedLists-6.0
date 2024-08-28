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
    public String getSname() {
        return personname;
    }
    public void setSname(String personname) {
        this.personname = personname;
    }
    public char getSgender() {
        return salary;
    }
    public void setSgender(char salary) {
        this.salary = salary;
    }
    public person(int sid, String personname, char salary) {
        this.sid = sid;
        this.personname = personname;
        this.salary = salary;
    }
    public person() {
    }
    @Override
    public String toString() {
        return "person [sid=" + sid + ", personname=" + personname + ", salary=" + salary +"]";
    }
    

}
