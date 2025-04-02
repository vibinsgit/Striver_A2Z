import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Hello");
        list.add("Bye");
        list.add("Hello");
        list.add("Good");
        list.add("Bad");
        list.add("Good");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
