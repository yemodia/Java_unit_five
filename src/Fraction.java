/**
 *
 * This Fraction class is able to divide, add, subtract, and simplify one or two fractions
 *
 * @author Yerim Dia
 * @since February 10, 2020
 */



public class Fraction {
    private int numerator;
    private  int denominator;

    /**
     *
     * @param numerator
     * @param denominator
     */


    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator < 0 || numerator < 0){
            this.numerator = numerator;
            this.denominator = denominator;
        }

        int gCD = gcd(this.numerator, this.denominator);

        this.numerator/=gCD;
        this.denominator/=gCD;


    }


    private int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }



    public Fraction(){
        this(1,1);
    }


    public static Fraction add(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.denominator;
        int product2 = f1.denominator * f2.numerator;

        int numeratorSum = product1 + product2;
        int finalDenominator = f1.denominator * f2.denominator;
        return new Fraction(numeratorSum, finalDenominator);

    }

    public static Fraction subtract(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.denominator;
        int product2 = f1.denominator * f2.numerator;

        int finalNumerator = product1 - product2;
        int finalDenominator = f1.denominator * f2.denominator;

        return new Fraction(finalNumerator, finalDenominator);

    }

    public static Fraction multiply(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.numerator;
        int product2 = f1.denominator * f2.denominator;

        return new Fraction(product1, product2);

    }

    public static Fraction divide(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.denominator;
        int product2 = f1.denominator * f2.numerator;

        return new Fraction(product1, product2);
    }

    public String toString(){
        return numerator + "/" + denominator;
    }





}


