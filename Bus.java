
public class Bus extends Vehicle
{
    private double standPlaces;
    public Bus(String model, int maxSpeed, int numOfSeats, int standPlaces, boolean isOn, String gear){
        super(model, maxSpeed, numOfSeats, isOn, gear);
        this.standPlaces = standPlaces;
    }
    public double getStandPlaces(){
        return this.standPlaces;
    }
    public void setStandPlaces(double standPlaces){
        this.standPlaces = standPlaces;
    }
    public double countPercentage(){
        return (getStandPlaces() / getNumOfSeats()) * 100; 
    }
    public String display(){
        return "Model: " + getModel() + "\nMax speed: " + getMaxSpeed() + "km/h" + "\nNumber of standing places is " + getStandPlaces() + " and the whole number of places is " + getNumOfSeats() + ". So standing places represent " + countPercentage() + "% of all places." + "\nBus is on: " + getIsOn() + "\nGear: " + getGear(); 
    }
}
