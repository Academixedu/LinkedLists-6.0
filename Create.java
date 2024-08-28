
public class Create {
    public static void main(String[] args) {
        // Create a LinkedList class object
        List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(8);

        // Iterate through the list using an Iterator
        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
