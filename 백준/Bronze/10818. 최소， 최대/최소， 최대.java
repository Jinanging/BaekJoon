
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int[] numberArray = new int[number];
		
		for(int i = 0; i < number; i++) {
			numberArray[i] = scan.nextInt();
		}
		int max = numberArray[0];
		int min = numberArray[0];
		for(int i = 0; i < number; i++) {
			if(max <= numberArray[i]) {
				max = numberArray[i];
			}
			if(min >= numberArray[i]) {
				min = numberArray[i];
			}
		}
		System.out.println(min + " " + max);
		scan.close();
		

	}

}
