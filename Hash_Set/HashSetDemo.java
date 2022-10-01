package Hash_Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String> fruitName = new HashSet<>();
        fruitName.add("Apple");
        fruitName.add("Orange");
        fruitName.add("Banana");
        fruitName.add("Mango");
        fruitName.add("Mango");
        fruitName.add("Strwberry");
        
        System.out.println(fruitName);
        System.out.println("Size of HashSet = "+fruitName.size());

        System.out.println(fruitName.contains("Orange"));

        fruitName.remove("Apple");
        System.out.println(fruitName);
        // fruitName.clear();
        // System.out.println(fruitName);
        boolean value =  fruitName.isEmpty();
        System.out.println(value);

    }
}
