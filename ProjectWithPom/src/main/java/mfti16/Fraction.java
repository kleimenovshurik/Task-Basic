package mfti16;

public class Fraction {
    final private int numerator;
    final private int denumerator;

    public Fraction(int numerator, int denumerator) {
        if (denumerator == 0 || denumerator < 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль, знаменатель должен быть отличен от нуля и не может быть отрицательным ");
        } else {
            this.denumerator = denumerator;
        }
        this.numerator = numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public int getNumerator() {
        return numerator;
    }


    @Override
    public String toString() {
        return
                "" + numerator + "/" +
                        denumerator;
    }

    public Fraction plus(Fraction other) {
        int num = this.numerator * other.denumerator + other.numerator * this.denumerator;
        int den = this.denumerator * other.denumerator;
        return new Fraction(num, den);
    }

    public Fraction minus(Fraction other) {
        int num = this.numerator * other.denumerator - other.numerator * this.denumerator;
        int den = this.denumerator * other.denumerator;
        return new Fraction(num, den);
    }

    public Fraction multiply(Fraction other) {
        int num = this.numerator * other.numerator;
        int den = this.denumerator * other.denumerator;
        return new Fraction(num, den);
    }

    public Fraction div(Fraction other) {
        int num = this.numerator * other.denumerator;
        int den = this.denumerator * other.numerator;
        return new Fraction(num, den);
    }

    // для работы с целым числом

    public Fraction plus(int number) {
        return this.plus(new Fraction(number, 1));
    }

    public Fraction minus(int number) {
        return this.minus(new Fraction(number, 1));
    }

    public Fraction multiply(int number) {
        int num = this.numerator * number;
        int den = this.denumerator * 1;
        return new Fraction(num, den);
    }

    public Fraction div(int number) {
        int num = this.numerator * 1;
        int den = this.denumerator * number;
        return new Fraction(num, den);
    }







}
