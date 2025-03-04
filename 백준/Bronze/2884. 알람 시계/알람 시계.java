

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int totalMinute = (hour * 60) + minute;
		totalMinute -= 45;
		if(totalMinute <0) {
			totalMinute += (60*24);
		}
		
		System.out.println((totalMinute / 60) + " " + (totalMinute % 60));
		
	}

}
