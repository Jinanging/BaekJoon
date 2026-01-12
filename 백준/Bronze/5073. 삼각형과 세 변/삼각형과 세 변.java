

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();

            if (first == 0 && second == 0 && third == 0) {
                break;
            }

            int max = Math.max(first, Math.max(second, third));
            int sum = first + second + third - max;

            if (sum <= max) {
                System.out.println("Invalid");
            } else if (first == second && second == third) {
                System.out.println("Equilateral");
            } else if (first == second || second == third || first == third) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
