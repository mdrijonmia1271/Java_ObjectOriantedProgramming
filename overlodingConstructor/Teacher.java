package overlodingConstructor;

public class Teacher {
    
    String name, gender;
    int phone;

    //constructor
    Teacher(){
        System.out.println("No Information");
    }

    //constructor
    Teacher(String n, String m){
        name = n;
        gender = m;
    }

    //constructor
    Teacher(String n, String m, int p){
        name = n;
        gender = m;
        phone = p;
    }

    //output Method
    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone = "+phone);
        System.out.println("\n");
    }
}
