

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double number = scan.nextInt();
		double max = scan.nextInt();
		double sum = max;
		double average;
		for(int i = 1; i < number; i++) {
			double newScore = scan.nextInt();
			sum += newScore;
			if(max <= newScore) {
				max = newScore;
			}
			
			
		}
		
		average = sum / number;
		
		average = average / max * 100;
		System.out.println(average);	

	}

}
