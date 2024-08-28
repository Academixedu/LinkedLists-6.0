public class person {
    private int id;
    private String name;
    public person(int id, String name) {
        this.id = id;
        this.name = name;

    }
    
    @Override
    public String toString() {
        return "person [id=" + id + ", name=" + name + "]";
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

    public static void main(String[] args) {
        person i = new person(10, "nfn");

    }
}