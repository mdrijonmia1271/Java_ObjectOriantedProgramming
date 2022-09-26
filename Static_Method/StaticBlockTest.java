package Static_Method;

public class StaticBlockTest {

    static{
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticBlock.display();
    }
}
