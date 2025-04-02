import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //Creating ArrayList
        list.add("Vibins"); // Adding object
        list.add("Aswin"); 
        list.add("Ram"); 
        list.add("John"); 
        list.add("Raju"); 
        list.add("Raju"); 

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
