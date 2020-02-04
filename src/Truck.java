public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private final double CAPACITY = 20.0;
    private static double totalFuel;


    public Truck(String truckName){
        truckID = truckName;
    }

    public Truck(String truckName, double odometer, double mpg, double fuel){
        this.odometer = odometer;
        truckID = truckName;
        this.mpg = mpg;
        this.fuel = fuel;
    }

    public double getOdometer(){
        return odometer;
    }

    public double getCAPACITY() {
        return CAPACITY;
    }

    public double getFuel() {
        return fuel;
    }

    public double getMpg() {
        return mpg;
    }

    public String getTruckID() {
        return truckID;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public boolean enoughFuel(double miles){
       double distance = fuel * mpg;
        if (miles > distance){
            return false;
        }
        else return true;
    }

    public String drive(double miles2){
        String finalOutput = "";
        if (enoughFuel(miles2) == true ){
            odometer += miles2;
            fuel -= (miles2 / mpg);
            finalOutput += "Success";
        }
        else if (enoughFuel(miles2) == false)
        finalOutput += "Truck " + truckID + " does not have enough fuel to drive " + odometer + " miles";
           return finalOutput;

    }

    public void fill(){
        double fuelNeed = CAPACITY - fuel;
        if(fuel < CAPACITY)
            fuel += fuelNeed;
        totalFuel += fuelNeed;
    }

    public String fill(double gallons){
        if (gallons + fuel <= CAPACITY){
            fuel += gallons;
            totalFuel += gallons;
            return "Success";
        }
        else
            return "Truck " + truckID + ": Gallons exceeds tank capacity";

    }

    public static double getTotalFuel(){
        return  totalFuel;
    }

    public String toString(){
        return "Truck: " + truckID + "\n Odometer: " + odometer + "\n Miles Per Gallon: "+ mpg + "\nFuel: " + fuel ;
    }

}
