package static_Keyword;


public class Student {
    
    String name;
    int id;
    static String universityName = "Dhaka Univesity";

    Student(String nam, int i){
        name = nam;
        id = i;
    }

    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Id = "+id);
        System.out.println("Univesuity Name = "+universityName);
        System.out.println();
    }
}
