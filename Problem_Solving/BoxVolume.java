package Problem_Solving;

public class BoxVolume {
    
    double height, width, depth;

    BoxVolume(double height, double width, double depth){
            this.height = height;
            this.width = width;
            this.depth = depth;

    }
    void displayVol(){
        double Result = height*width*depth;
        System.out.println("Result of Volume is = "+Result);
    }
}
