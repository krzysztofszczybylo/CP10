public class Truck extends Vehicle
{
    private String capacity;
    public Truck(String model, int maxSpeed, int numOfSeats, String capacity, boolean isOn, String gear){
        super(model, maxSpeed, numOfSeats, isOn, gear);
        this.capacity = capacity;
    }
    public String getCapacity(){
        return this.capacity;
    }
    public void setCapacity(String capacity){
        this.capacity = capacity;
    }
    public String display(){
        return "Model: " + getModel() + "\nMax speed: " + getMaxSpeed() + "km/h" + "\nNumber of seats: " + getNumOfSeats() + "\nCapacity: " + getCapacity() + "\nTruck is on: " + getIsOn() + "\nGear: " + getGear(); 
    }
}
