

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dice1 = scan.nextInt();
		int dice2 = scan.nextInt();
		int dice3 = scan.nextInt();
		int reward;
		if(dice1 == dice2 && dice2 == dice3) {
			reward = 10000+(dice1 * 1000);
			
		}
		else if((dice1 == dice2 || dice2 == dice3) || dice1 == dice3){
			if(dice1 == dice2) {
				reward = 1000 + (dice1 * 100);
			}
			else if(dice2 == dice3) {
				reward = 1000 + (dice2 * 100);
			}
			else {
				reward = 1000 + (dice3 * 100);
			}
		
		}
		else {
			int max = Math.max(Math.max(dice1,dice2),dice3);
			reward = max * 100;
		}
		System.out.println(reward);
		scan.close();
		

	}

}
