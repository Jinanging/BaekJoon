
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		number = number / 4;
		for(int i = 0; i < number; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		scan.close();

	}

}
