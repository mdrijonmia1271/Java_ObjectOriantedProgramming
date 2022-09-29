package Problem_Solving_02;

public class Circle extends Shape {
    //area = 3.1416*r*r
    
    Circle(double radias){
        super(radias,radias);
    }

    @Override
    void area(){
        double result = Math.PI*dim1*dim2;
        System.out.printf("Circle Area = %.2f",result);
    }


}
