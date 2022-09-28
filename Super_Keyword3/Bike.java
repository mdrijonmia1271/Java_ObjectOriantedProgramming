package Super_Keyword3;

public class Bike extends Vehicle {
    
    int lookingGlass;

    //constructor
    Bike(String color, int weight, int lookingGlass){
        //Calling the Constructor of Vehicle class
        super(color, weight);
        this.lookingGlass = lookingGlass;
    }

    @Override
    void attribute(){
        System.out.println("Bike Information :");
        super.attribute();
        System.out.println("LooKingGlass = "+lookingGlass);
    }
}
