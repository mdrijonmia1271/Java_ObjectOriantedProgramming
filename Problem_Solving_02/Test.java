package Problem_Solving_02;

public class Test {
    public static void main(String[] args) {
        
        Shape shape;//Referance Variable
        shape = new Rectangle(10, 20);
        shape.area();

        shape = new Triangle(10,20);
        shape.area();

        shape = new Circle(10);
        shape.area();
    }
}
