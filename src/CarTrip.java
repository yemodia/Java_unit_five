
public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(double myEndOdometer, double myStartOdometer, double myGallonsUsed, double myTime){
        this.myEndOdometer = myEndOdometer;
        this.myStartOdometer = myStartOdometer;
        this.myGallonsUsed = myGallonsUsed;
        this.myTime = myTime;
    }

    public CarTrip(){
        this.myEndOdometer = 0.0;
        this.myStartOdometer = 0;
        this.myGallonsUsed = 0;
        this.myTime = 0;
    }

    public double getMyEndOdometer(){
        return myEndOdometer;

    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyTime() {
        if (myTime == 0)
            return 0;
        return myTime;
    }
    public double getTripDistance(){
        return getAverageSpeed() * getMyTime();
    }

    public double getAverageSpeed(){
        return getTripDistance() / getMyTime();
    }

    public double getGasMileage(){
        return myEndOdometer-myStartOdometer;
    }

    public double getTotalGasPrice(){
        return getGasMileage();
    }

    public String toString(){
       return "Distance traveled:" + getTripDistance();
    }
}