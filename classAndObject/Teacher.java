package classAndObject;

public class Teacher {
    String name,gender;
    int Phone;

    //non peramitrized constractor-----
    Teacher(){
        System.out.println("No Value");
    }

   //Constructor(Special type of method)---
    Teacher(String nam, String gen, int ph){
        name = nam;
        gender = gen;
        Phone = ph;

    }

    //Output Method--------
    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone = "+Phone);
    }
}
