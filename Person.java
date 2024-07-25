public class Person {
    
    public int id;
    public String name;
    public String Desg;
    public Person(int id, String name, String desg) {
        this.id = id;
        this.name = name;
        Desg = desg;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesg() {
        return Desg;
    }
    public void setDesg(String desg) {
        Desg = desg;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", Desg=" + Desg + "]";
    }

    
}
