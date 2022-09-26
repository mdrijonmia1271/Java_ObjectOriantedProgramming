package Static_Method;

public class StaticBlock {
    
    static int id;
    static String name;

    //Static Block
    static{
        id = 201;
        name = "Rijon";
    }
    
    static void display(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
}
