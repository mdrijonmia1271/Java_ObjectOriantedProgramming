package Variable_Length_Arguments;

public class VariableLength {
    
    void add(int...num){
        int sum = 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
