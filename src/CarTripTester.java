public class CarTripTester {

    public static void main(String[] args){
        CarTrip carTrip1 = new CarTrip();
        CarTrip carTrip2 = new CarTrip(25,0,5,10 );

        System.out.println(carTrip1.getMyEndOdometer());
        System.out.println(carTrip1.getMyStartOdometer());
        System.out.println(carTrip1.getMyTime());
        System.out.println(carTrip1.getMyGallonsUsed());
        System.out.println(carTrip1.toString());

        System.out.println(carTrip2.getMyEndOdometer());
        System.out.println(carTrip2.getMyStartOdometer());
        System.out.println(carTrip2.getMyTime());
        System.out.println(carTrip2.getMyGallonsUsed());
        System.out.println(carTrip2.toString());

    }


}
