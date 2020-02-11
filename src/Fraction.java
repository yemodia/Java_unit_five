/**
 *
 * This Fraction class is able to divide, add, subtract, and simplify fractions
 *
 * @author Yerim Dia
 * @since February 10, 2020
 */


public class Fraction {
    private int numerator;
    private  int denominator;

    /**
     *
     * @param numerator the variable that wil represent the numerator of the fractions
     * @param denominator the variable that will represent the denominator of the fractions
     */

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator < 0){
            this.numerator = numerator *-1 ;
            this.denominator = denominator * -1;
        }
        else if (denominator < 0 && numerator < 0){
            this.numerator = numerator * -1;
            this.denominator = denominator *-1;

        }
        int gCD = Math.abs(gcd(this.numerator, this.denominator));

        this.numerator/=gCD;
        this.denominator/=gCD;
    }

    /**
     *
     * @param m the numerator the fraction
     * @param n the greates common denominator
     * @return the greatest common denominator between the two fractions
     */
    private int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    /**
     * calls the other constructor and assigns default value of 1
     */
    public Fraction(){
        this(1,1);
    }


    /**
     * This method add two fractions together.
     * @param f1 the product of the numerator of fraction one multiplied by the denominator of the second
     * @param f2 the product of the numerator of fraction two multiplied by the denominator of the first
     * @return it returns a one Fraction with the sum of f1 and f2 over the product of the denominators.
     */
    public static Fraction add(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.denominator;
        int product2 = f1.denominator * f2.numerator;

        int numeratorSum = product1 + product2;
        int finalDenominator = f1.denominator * f2.denominator;
        return new Fraction(numeratorSum, finalDenominator);

    }

    /**
     * This method subtracts two fractions.
     * @param f1  the product of the numerator of fraction one multiplied by the denominator of the second.
     * @param f2 the product of the numerator of fraction two multiplied by the denominator of the first.
     * @return it returns a one Fraction with f1 - f2 over the product of the denominators.
     */
    public static Fraction subtract(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.denominator;
        int product2 = f1.denominator * f2.numerator;

        int finalNumerator = product1 - product2;
        int finalDenominator = f1.denominator * f2.denominator;

        return new Fraction(finalNumerator, finalDenominator);

    }

    /**
     * This method multiples two fractions. It is done by multiplying the numerators together and the denominators together.
     * @param f1 the numerator of the first fraction multiplied by the second.
     * @param f2 the product of the denominators.
     * @return returns a Fraction with the product of the numerator over the product of the denominators.
     */
    public static Fraction multiply(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.numerator;
        int product2 = f1.denominator * f2.denominator;

        return new Fraction(product1, product2);

    }


    /**
     * This method divides two fractions. Using the formula of multiplying the first fraction by the reciprocal of the second
     * @param f1 the numerator of the first fraction multiplied by the denominator of the second.
     * @param f2  the numerator of the second fraction multiplied by the denominator of the first.
     * @return returns a Fraction with the total of product1 over product2.
     */
    public static Fraction divide(Fraction f1, Fraction f2){
        int product1 = f1.numerator * f2.denominator;
        int product2 = f1.denominator * f2.numerator;

        return new Fraction(product1, product2);
    }

    /**
     * This method returns the layout of a fraction, numerator/ denominator, ex. 1/2
     * @return returns the fraction in form a/b.
     */
    public String toString(){
        return numerator + "/" + denominator;
    }





}


