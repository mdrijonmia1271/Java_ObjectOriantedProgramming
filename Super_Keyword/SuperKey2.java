package Super_Keyword;

public class SuperKey2 extends SuperKey1 {
    
    int x = 5;
    @Override
    void display(){
        // x of super class
        System.out.println("Value of super variable = "+super.x);
        super.display();
        System.out.println("Insite B clas");
    }
}
