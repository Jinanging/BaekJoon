

import java.util.Scanner;

public class Main {

    public static long combination(int n, int m) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= (m - i + 1);
            result /= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        String result = "";

        for (int i = 0; i < testCase; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            result += combination(n, m) + "\n";
        }

        System.out.print(result);
    }
}
