import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sett {
    public static void main(String[] args) {
        // Example of using HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");

        // Example of using LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Example of using TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

    }
}