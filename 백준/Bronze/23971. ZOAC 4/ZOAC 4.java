import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int row = (H + N) / (N + 1);
        int col = (W + M) / (M + 1);

        System.out.println(row * col);
    }
}
