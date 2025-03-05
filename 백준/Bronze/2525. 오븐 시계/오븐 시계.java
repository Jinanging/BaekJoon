

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int needTime = scan.nextInt();
		
		int totalMinute = (hour * 60) + minute + needTime;
		hour = totalMinute / 60;
		minute = totalMinute % 60;
		if(hour >= 24) {
			hour -= 24;
		}
		System.out.println(hour + " " + minute);
		scan.close();
		

	}

}
