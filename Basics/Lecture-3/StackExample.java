import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        
        s.add("Deva");
        s.add("Midhun");
        s.add("Hari");
        s.add("Jabars");
        s.pop();            //Remove last element

        Iterator<String> itr = s.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
