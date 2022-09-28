package Final_Keyword;

public class Univesity {
    final String UNIVERSITY_NAME = "Dhaka University"; //Not Modify or Change
    final int fee; //Blank final variable
    static final int totalStudent; //Static blank final variable

    //constructor
    Univesity(){
        fee = 3700;
    }
    static{
        totalStudent = 3000;
    }

    void display(){
        System.out.println("University Name : "+UNIVERSITY_NAME);
        System.out.println("Fee = "+fee);
        System.out.println("Total Student = "+totalStudent);
    }
}
