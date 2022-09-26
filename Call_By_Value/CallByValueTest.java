package Call_By_Value;

public class CallByValueTest {
    public static void main(String[] args) {
        
        CallByValue obj = new CallByValue();
        int x =10; //primitive data
        System.out.println("Before Calling = "+x);

        obj.change(x);
        System.out.println("After Calling = "+x);
    }
}
