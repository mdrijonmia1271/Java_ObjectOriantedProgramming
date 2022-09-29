package Abstraction;

public abstract class MobileUser {
    
    //non abstract method
    void Call(){
        System.out.println("Call Method");
    }
    
    //abstract Method
    abstract void sendMessage();
    
}
