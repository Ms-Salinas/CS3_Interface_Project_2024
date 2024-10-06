/**The Car subclass implements the CarLog interface to create a simple car.
@implementor Giovani Zuniga*/
public class Car implements CarLog{
    /**
     List of all known variables from the interface CarLog.
    */
    private String TypeOfVehicle;
    private int Mileage, mph, numSeats, Capacity;
    
    /** Non-parameterized constructor */
    public Car() {
        TypeOfVehicle = "NONE";
        Mileage = 0;
        mph = 0;
        numSeats = 0;
        Capacity = 0;
    } 
    /**
     getNumPassengers() returns the number of seats in the car 
    */
    public int getNumPassengers(){
        return numSeats;
    }
    /**
     setfuelCap() sets a new fuel capacity to the vehicle 
    */
    public void SetfuelCap(int cap){
       Capacity = cap;
    }
    /**
      CreateVehicle() Creates a normal car from the given parameters.
    */
    public void CreateVehicle(String TypeOfVehicle, int Mileage, int mph, int numSeats, int Capacity){
        this.TypeOfVehicle = TypeOfVehicle;
        this.Mileage = Mileage;
        this.mph = mph;
        this.numSeats = numSeats;
        this.Capacity = Capacity;
    }
    /**
      getMileage() returns the ammount of miles the car currently has.
    */
    public int getMileage(){
        return Mileage;
    }
    /**
      getMilesPerHour() returns the ammount of miles the car can run in a certain time (MPH).
    */
    public int getMilesPerHour(){
        return mph;
    }
}