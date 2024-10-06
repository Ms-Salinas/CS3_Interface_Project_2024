/**The Truck subclass implements the CarLog interface to create a simple truck.
@implementor Giovani Zuniga*/
public class Truck implements CarLog{
    /**
     List of all known variables from the interface CarLog.
    */
    private String TypeOfVehicle;
    private int Mileage, mph, numSeats, Capacity;
    private double cargoSpace;
    
    /** Non-parameterized constructor */
    public Truck() {
        TypeOfVehicle = "NONE";
        Mileage = 0;
        mph = 0;
        numSeats = 0;
        Capacity = 0;
        cargoSpace = 0;
    } 
    /**
     getNumPassengers() returns the number of seats in the truck. 
    */
    public int getNumPassengers(){
        return numSeats;
    }
    /**
     getCargoSpace() returns the number of space in the back of the truck.
    */
    public double getCargoSpace(){
        return cargoSpace;
    }
    /**
     getNumPassengers() returns the number of seats in the truck. 
    */
    public double setCargoSpace(int space){
        cargoSpace = space;
    }
    /**
     setfuelCap() sets a new fuel capacity to the vehicle 
    */
    public void SetfuelCap(int cap){
       Capacity = cap;
    }
    /**
      CreateVehicle() Creates a normal truck from the given parameters.
    */
    public void CreateVehicle(String TypeOfVehicle, int Mileage, int mph, int numSeats, int Capacity){
        this.TypeOfVehicle = TypeOfVehicle;
        this.Mileage = Mileage;
        this.mph = mph;
        this.numSeats = numSeats;
        this.Capacity = Capacity;
    }
    /**
      getMileage() returns the ammount of miles the truck currently has.
    */
    public int getMileage(){
        return Mileage;
    }
    /**
      getMilesPerHour() returns the ammount of miles the truck can run in a certain time (MPH).
    */
    public int getMilesPerHour(){
        return mph;
    }
}