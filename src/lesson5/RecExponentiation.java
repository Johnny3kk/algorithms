package lesson5;

public class RecExponentiation {

    public static void main(String[] args) {

        System.out.println(recExponentiation(-2, 7));
    }

    public static int recExponentiation(int base, int exponent) {
        if (base == 0) return 0;
        if (base == 1) return 1;
        if (exponent <= 0) return 1;
        return recExponentiation(base, exponent - 1) * base;
    }
}
