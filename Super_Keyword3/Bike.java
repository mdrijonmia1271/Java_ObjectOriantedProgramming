package Super_Keyword3;

public class Bike extends Vehicle {
    
    int lookingGlass;

    Bike(String color, int weight, int lookingGlass){
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
