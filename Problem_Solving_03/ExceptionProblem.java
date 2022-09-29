package Problem_Solving_03;

import java.util.Scanner;


public class ExceptionProblem {
    public static void main(String[] args) {
        int count = 1;
       do{
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter num1 : ");
            int num1 = input.nextInt();
            System.out.print("Please enter num2 : ");
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println("Result: "+num1+"/"+num2+" = "+result);
            System.out.println("Program Successfull");
            System.out.println();
            count = 2;
            input.close();
            }catch(Exception e){
                System.out.println("Exception: "+e);
                System.out.println("your must enter interger.please try again");
                System.out.println();
            }
            
       }while(count==1);

    }
}
