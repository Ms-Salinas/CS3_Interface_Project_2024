/**
This interface is for maintaining cars, checking their fuel, how fast they can go, etc.
@author Giovani Zuniga
*/
interface CarLog{
    /**
  Abstract method to return the number of passengers set from the CreateVehicle() method
  @return a integer number of passengers the vehicle can hold
  */
    int getNumPassengers();
    /**
  Abstract method to set how much gas the car can hold
  @param cap a int for the limit on how much gas the car can carry
  */
    void SetfuelCap(int cap);
    /**
  Abstract method to create a vehicle with the inputted values
  @param TypeOfVehicle is a string for the type of vehicle it is
  @param Mileage is a int for applying how used the vehicle is
  @param mph is a int for setting how fast the vehicle can go
  @param numSeats is a int for setting how many passengers can fit inside
  @param Capacity is a int for setting how much fuel can go inside the vehicle
  */
    void CreateVehicle(String TypeOfVehicle, int Mileage, int mph, int numSeats, int Capacity);
    /**
  Abstract method to return the number of miles the car has from the CreateVehicle() method
  @return a integer that was set from the CreateVehicle() method
  */
    int getMileage();
    /**
  Abstract method to return the speed of the car that was set from the CreateVehicle() method
  @return a integer that was set from the CreateVehicle() method
  */
    int getMilesPerHour();
}