

public abstract class Vehicle
{
    private String model;
    private int maxSpeed;
    private int numOfSeats;
    private boolean isOn;
    private String gear;
    public Vehicle(String model, int maxSpeed, int numOfSeats, boolean isOn, String gear)
    {
        this.model = model; 
        this.maxSpeed = maxSpeed; 
        this.numOfSeats = numOfSeats;
        this.isOn = isOn;
        this.gear = gear;
    }
    public abstract String display();
    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff(){
        this.isOn = false;
    }
    public void setGear(String gear){
        this.gear = gear;
    }
    
    public String getGear(){
        return this.gear;
    }
    public boolean getIsOn(){
        return this.isOn;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public int getNumOfSeats(){
        return this.numOfSeats;
    }
    public void set(int numOfSeats){
        this.numOfSeats = numOfSeats;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public static void main(String[] args){
        Car c1 = new Car("Car One", 200, 5, false, "1");
        Bus b1 = new Bus("Bus One", 160, 50, 17, true, "R");
        Truck t1 = new Truck("Bus One", 120, 3, "12 tons", true, "N");
        System.out.println(c1.display());
        c1.setGear("R");
        System.out.println(c1.display());
        c1.turnOn();
        System.out.println(b1.display());
        System.out.println(t1.display());
        System.out.println(c1.display());
        
    }
    
}
