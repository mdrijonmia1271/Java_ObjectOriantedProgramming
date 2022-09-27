package Inheritance;


//Extends Person Calss to Teacher class
public class Teacher extends Person {
    
    String qualification;

    void displayInformation2(){

        //call person class
        displayInformation1();
        System.out.println("Qualification = "+qualification);
        System.out.println();
    }

}
