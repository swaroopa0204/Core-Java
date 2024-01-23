import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
       int N = 6;
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + N + " terms: ");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
