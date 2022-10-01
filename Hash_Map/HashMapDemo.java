package Hash_Map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //put and get
        HashMap<Integer, String> costomer = new HashMap<>();
        costomer.put(101, "Rijon");
        costomer.put(102, "Mohosin");
        costomer.put(103, "Tahbila");
        
        System.out.println(costomer.get(103));
        System.out.println(costomer.get(102));
        System.out.println(costomer.get(101));
        System.out.println(costomer.containsKey(101));
    }
}
