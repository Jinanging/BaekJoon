

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int number = scan.nextInt();
		int calculate = 0;
		for(int i = 0; i < number; i++) {
			int price = scan.nextInt();
			int num = scan.nextInt();
			calculate = (price * num) + calculate; 
		}
		if(calculate == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		scan.close();
	}

}
