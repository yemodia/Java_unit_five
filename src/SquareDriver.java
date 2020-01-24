import java.util.Scanner;

public class SquareDriver {
    public static void main(String[] args){
        Scanner squareScan = new Scanner(System.in);


        System.out.println("Enter the side of a square: ");
        double ss = squareScan.nextDouble();

        Square Sq = new Square(ss);




        System.out.println(Sq.calculateArea());

        System.out.println(Sq);

    }
}
