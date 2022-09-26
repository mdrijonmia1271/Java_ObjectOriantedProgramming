package Factorial_And_Recursion;


public class FactorialNumber {
    
    //Recursion Method and factorial number
    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
