



public class Fraction {
    private int numerator;
    private  int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
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





}


