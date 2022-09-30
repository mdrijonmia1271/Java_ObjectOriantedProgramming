package Linked_List;

import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> countryName = new LinkedList<String>();

        countryName.add("Bangladesh");
        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add("Afganishtan");
        countryName.add("Soudi Arabia");
        countryName.add(5,"Kuwait");
        countryName.addFirst("Canada");
        countryName.addLast("Chaina");
        // countryName.remove("India");
        // countryName.remove(3);
        // countryName.removeFirst();
        // countryName.removeLast();

        System.out.println("Country Name :");
        for(String country : countryName){
            System.out.println(country);
        }

        System.out.println("Size of the LinkedList = "+countryName.size());
        System.out.println("First Element : "+countryName.getFirst());
        System.out.println("Last Elemnt : "+countryName.getLast());

        countryName.clear();
        System.out.println("After Clear LinkedList = "+countryName);
    }
}
