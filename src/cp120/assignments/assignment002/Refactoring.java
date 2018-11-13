package cp120.assignments.assignment002;

import java.math.BigInteger;

public class Refactoring {
    public static void main(String[] args) {
        // variables declaration - height, width and area variables
        int x, y, a1, a2, a3, aa;
        // (1) Box 1: Find the area
        x = 10;
        y = 20;
        a1 = area(x, y);

        // (2) Box 2: Find the area
        x = 31;
        y = 4;
        a2 = area(x, y);

        // (3) Box 3: Find the area
        x = 14;
        y = 12;
        a3 = area(x, y);

        // (4) Find the area
        long a4 = 3333333 * 444444L;

        long big = 3333333 * 444444L;
        BigInteger bigI = BigInteger.valueOf(3333333 * 444444L);

        // (5) Find the average area of a1 and a2
        aa = (a1 + a2)/2;

        System.out.println("a1=" + a1);
        System.out.println("a2=" + a2);
        System.out.println("a3=" + a3);
        System.out.println("a4=" + a4);
        System.out.println("aa=" + aa);
        System.out.println("big=" + big);
        System.out.println("bigI=" + bigI);

        /******* (5) Print the area if it is prime number ******/
        if (isPrime(a1) == true) {
            System.out.printf("Area a1 is a prime!", a1);
        }
        if (isPrime(a2) != false) {
            System.out.printf("Area a2 is a prime!", a2);
        }
        if (isPrime(a3)) {
            System.out.printf("Area a3 is a prime!", a3);
        }
    }

    /** returns the minimum of two numbers */
    public static int area(int h, int w) {
        return h*w;
    }

    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false; // number is perfectly divisible - not prime
            }
        }
        return true;
    }
}
