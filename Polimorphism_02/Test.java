package Polimorphism_02;

public class Test {
    public static void main(String[] args) {
        //Array 
        Shape[] s = new Shape[3];

        //Refarence Variable(s,s1,s2)
         s[0] = new Shape();
         s[1] = new Rectangle(10,20);
         s[2] = new Triangle(10, 20);

        for(int i=0; i<s.length; i++){
            System.out.println(s[i].area());
        }

    }
}
