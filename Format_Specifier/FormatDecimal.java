package Format_Specifier;

import java.text.DecimalFormat;

public class FormatDecimal {
    public static void main(String[] args) {
        
        // //C Programmin format Specifier
        double x = 3.88476674;
        System.out.printf("X = %.2f ",x);

        //Java programming format Specifier
        DecimalFormat obj = new DecimalFormat("0.000");
        double y = 4.663763;
        System.out.println("\nY = "+obj.format(y));
    }
}
