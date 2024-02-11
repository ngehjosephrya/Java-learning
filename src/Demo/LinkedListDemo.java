package Demo;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();


        list.add("a");
        list.add("b");
        list.addLast("c");
        list.addFirst("d");
        list.add(2,"e");
        
        System.out.println(list);
    }
    
}
