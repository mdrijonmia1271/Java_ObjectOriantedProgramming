package Call_By_Reference;

public class CallByReferenceTest {
    public static void main(String[] args) {
        
        CallByReference r1 = new CallByReference();
        r1.name = "Rijon";
        System.out.println("Before Calling : "+r1.name);

        r1.change(r1);
        System.out.println("After Calling : "+r1.name);
    }
}
