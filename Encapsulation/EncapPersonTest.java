package Encapsulation;

public class EncapPersonTest {
    public static void main(String[] args) {
        
        Person obj = new Person();
        obj.setName("Rijon Islam");
        obj.setAge(22);

        System.out.println("Name = "+obj.getName());
        System.out.println("Age = "+obj.getAge());
    }
}
