

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int condition = scan.nextInt();
		int[] numberArray = new int[number];
		for(int i = 0; i < number; i++) {
			numberArray[i] = scan.nextInt();
			
		}
		for(int i = 0; i < number; i++) {
			if(numberArray[i] < condition) {
				System.out.print(numberArray[i] + " ");
			}
		}
		scan.close();
		

	}

}
