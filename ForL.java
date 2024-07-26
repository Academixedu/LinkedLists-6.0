import java.util.LinkedList;

 class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        for (String color : list) {
            System.out.println(color);
        }
    }
}
