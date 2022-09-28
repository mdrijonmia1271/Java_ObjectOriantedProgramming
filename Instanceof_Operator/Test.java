package Instanceof_Operator;

public class Test {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Person per = new Person();
        Teacher tcr = new Teacher();

        System.out.println(ani instanceof Animal);
        System.out.println(per instanceof Animal);
        System.out.println(tcr instanceof Person);
        System.out.println(tcr instanceof Animal);
        System.out.println(per instanceof Teacher);
    }
}
