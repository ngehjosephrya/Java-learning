package Demo;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("c"); 
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("e");

        System.out.println(treeSet);
    }

    
}
