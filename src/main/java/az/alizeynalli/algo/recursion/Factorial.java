package az.alizeynalli.algo.recursion;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

}
