package Variable_Length_Arguments;

public class VariableLengthTest {
    public static void main(String[] args) {
        
        VariableLength obj = new VariableLength();
        obj.add(+10, 20);
        obj.add(10,20,30);
        obj.add(10,20,30,40);
        obj.add(10,20,30,40,50);
    }
}
