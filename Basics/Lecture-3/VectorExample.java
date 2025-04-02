import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v= new Vector<String>();

        v.add("Manoj");
        v.add("Albert");
        v.add("Sanjay");

        Iterator<String> itr = v.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
