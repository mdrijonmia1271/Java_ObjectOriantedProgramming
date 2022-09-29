package Exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        
       try{
        int[] a = new int[4];
         a[4] = 10;
       }catch(ArithmeticException e1){
           System.out.println("Exception = "+e1);
       }catch(ArrayIndexOutOfBoundsException e2){
           System.out.println("Exception = "+e2);
       }
        
       finally{
        System.out.println("Last Line of The Program");
       }
    }
}
