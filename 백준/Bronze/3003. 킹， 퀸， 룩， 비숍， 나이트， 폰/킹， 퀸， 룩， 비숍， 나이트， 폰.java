
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] chessCount = new int[6];
		int[] correctCount = {1,1,2,2,2,8};
		for(int i = 0; i < chessCount.length; i++) {
			chessCount[i] = scan.nextInt();
		}
		for(int i = 0; i < chessCount.length; i++) {
			System.out.print(correctCount[i]-chessCount[i] + " ");
		}
		
		
		

	}

}
