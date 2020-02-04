public class TruckTest {
    public static void main(String[] args){
        Truck t1 = new Truck("123ABC");
        Truck t2 = new Truck("456DEF", 45500, 18, 10);

        t1.setMpg(15.0);
        t1.fill();
        t1.drive(150);
        System.out.println(t1);
        t1.drive(60);
        System.out.println(t1);
        System.out.println();

        System.out.println(t2.drive(500));
        System.out.println(t2.fill(30));
        t2.fill();
        t2.drive(300);
        System.out.println(t2);

        System.out.println();

        System.out.println(Truck.getTotalFuel());



    }

}
