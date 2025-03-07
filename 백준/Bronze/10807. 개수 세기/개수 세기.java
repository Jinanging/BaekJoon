

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeat = scan.nextInt();
		int[] numberArray = new int[repeat];
		
		for(int i = 0; i < repeat; i++) {
			numberArray[i] = scan.nextInt();
		}
		int checkNumber = scan.nextInt();
		int count = 0;
		for(int i = 0; i < repeat; i++) {
			if(numberArray[i] == checkNumber) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
