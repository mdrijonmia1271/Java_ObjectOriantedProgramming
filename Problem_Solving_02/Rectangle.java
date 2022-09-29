package Problem_Solving_02;

public class Rectangle extends Shape {
    
    Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    void area(){
        double result = dim1 *dim2;
        System.out.println("Rectrangle Area = "+result);
    }
}
