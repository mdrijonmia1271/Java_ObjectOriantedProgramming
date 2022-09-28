package Super_Keyword3;

public class Car extends Vehicle {

    int gear;

    Car(String color, int weight, int gear){
        //Calling the Constructor of Vehicle class
        super(color, weight);
        this.gear = gear;
    }

    @Override
    void attribute(){
        System.out.println("Car Information:");
        super.attribute();
        System.out.println("Gear = "+gear);
        System.out.println();
    }
}
