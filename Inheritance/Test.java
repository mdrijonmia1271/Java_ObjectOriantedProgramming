package Inheritance;

public class Test {
    public static void main(String[] args) {
        
        //object no 01
        Teacher obj = new Teacher();
        obj.Name = "Rijon";
        obj.Age = 22;
        obj.qualification = "Diploma in CSE";

        //object no 02
        Teacher obj1 = new Teacher();
        obj1.Name = "Mohosin";
        obj1.Age = 23;
        obj1.qualification = "Diploma in Civil";

        obj.displayInformation2();
        obj1.displayInformation2();

    }
}
