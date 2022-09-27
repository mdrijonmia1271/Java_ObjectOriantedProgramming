package Inheritance_Private_Member;

//Extenda Person Class
public class Teacher extends Person {
    
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void displayInformation(){
        System.out.println("Name = "+getName());
        System.out.println("Age = "+getAge());
        System.out.println("Qualification = "+getQualification());
        System.out.println();
    }
}
