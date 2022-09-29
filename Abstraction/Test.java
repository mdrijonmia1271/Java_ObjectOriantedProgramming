package Abstraction;

public class Test {
    public static void main(String[] args) {
        
        //super class
        MobileUser mu; //Create Reference variable
        mu = new Rahim();
        mu.Call();
        mu.sendMessage();

        mu = new Karim();
        mu.sendMessage();
    }
}
