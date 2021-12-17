

public class Car extends Vehicle
{
    public Car(String model, int maxSpeed, int numOfSeats, boolean isOn, String gear)
    {
        super(model, maxSpeed, numOfSeats, isOn, gear);
    }
    public String display(){
        return "Model: " + getModel() + "\nMax speed: " + getMaxSpeed() + "km/h" + "\nNumber of seats: " + getNumOfSeats() + "\nCar is on: " + getIsOn() + "\nGear: " + getGear(); 
    }
    
}
