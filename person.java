
public class person {
private int id;
private String names;
public int getId() {
    return id;
}

public person() {
}

public void setId(int id) {
    this.id = id;
}
public String getNames() {
    return names;
}
public void setNames(String names) {
    this.names = names;
}
public person(int id, String names) {
    this.id = id;
    this.names = names;
}

@Override
public String toString() {
    return "person [id=" + id + ", names=" + names + "]";
}

}
