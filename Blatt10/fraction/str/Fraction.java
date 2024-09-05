package fraction.str;

public class Fraction {
    private final int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int hashCode() {
        // make numerator and denominator unique by computing their greatest common
        // divisor and dividing by it
        int gcd = computeGcd(numerator, denominator);
        return numerator / gcd + (denominator / gcd) * 31;
        // Alternative way to do it:
        // It may suffer errors introduced by floating point arithmetic
        // return new Double((double) numerator/denominator).hashCode();
    }

    public static int computeGcd(int a, int b) {
        return b == 0 ? a : computeGcd(b, a % b);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Fraction)){
            return false;
        }
        Fraction other = (Fraction) obj;
        //this ensures that 3/4 and 6/8 are equal
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }

}
