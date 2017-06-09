package alex.bridge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int c = scanner.nextInt();

        int john = m - c;
        int zizi = n - c;
        int together = john + zizi + c;

        System.out.println(factorial(together - 1));
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}