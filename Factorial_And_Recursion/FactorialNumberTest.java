package Factorial_And_Recursion;

import java.util.Scanner;

public class FactorialNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User Input Factorial Number
        System.out.print("Enter Fatorial Number = ");
        int num = input.nextInt();
        
        FactorialNumber obj = new FactorialNumber();
        int Result = obj.fact(num);
        
        //Output Factorial Number
        System.out.println("Factorial of "+num+" = "+Result);

        
        //user input closed
        input.close();
    }
}
