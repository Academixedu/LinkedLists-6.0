import java.util.LinkedList;

public class ForL {
    public static void main(String[] args) {
        // Create a LinkedList object
        LinkedList<String> list = new LinkedList<>();

        // Add values
        list.add("Yash");
        list.add("Hemanth");
        list.add("Manoj");

        // Iterate it by using for-each loop
        for (String string : list) {
            System.out.println(string);
        }
    }
}
