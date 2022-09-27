package Inheritance_Private_Member;

public class PrivateMemberTest {
    public static void main(String[] args) {
        
        Teacher obj = new Teacher();
        obj.setName("Rijon");
        obj.setAge(21);
        obj.setQualification("Diploma in CSE");

        Teacher obj1 = new Teacher();
        obj1.setName("Mohosin");
        obj1.setAge(23);
        obj1.setQualification("Diploma in Civil");

        obj.displayInformation();
        obj1.displayInformation();
    }
}
