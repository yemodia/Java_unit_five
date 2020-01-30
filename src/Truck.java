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

    public Truck(double odometer, double mpg, double fuel){
        this.odometer = odometer;
        this.mpg = mpg;
        this.fuel = fuel;
    }


}
