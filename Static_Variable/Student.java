package Static_Variable;

public class Student {

    static int count = 0;
    //Constructor
    Student(){
        count++;
    }
    void totalStudent(){
        System.out.println("Total Student = "+count);
    }
}
