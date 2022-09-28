package Method_Overriding;


public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name =  "Rijon Islam";
        t1.age = 21;
        t1.qualification = "Diploma in CSE";
        t1.displayInformation();
        
        person p1 = new person();
        p1.name = "Mohosin Islam";
        p1.age = 23;
        p1.displayInformation();
        


    }
}
