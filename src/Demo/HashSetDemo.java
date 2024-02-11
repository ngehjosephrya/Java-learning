package Demo;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(5);

        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");
        System.out.println(hashSet);

        hashSet.remove("f");


        System.out.println("List Contains C or not?  " + hashSet.contains("c"));

        for(String Item : hashSet){
            System.out.println(Item);
        }
    }
}
