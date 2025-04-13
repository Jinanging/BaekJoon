
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int roopTime = 20;
		double totalCredit = 0;
		double gradeSum = 0;
		double gradeSwitch = 0;
		//버퍼 한번 비워주고 
		for(int i = 0; i < roopTime; i++) {
			String subjectName = scan.next();
			double credit = scan.nextDouble();
			String grade = scan.next();
			if(grade.equals("P")) {
				continue;
				
			}
			else {
				switch(grade) {
				
				case "A+":{
					gradeSwitch = 4.5;
					break;
				}
					
				case "A0":{
					gradeSwitch = 4.0;
					break;
				}
				case "B+":{
					gradeSwitch = 3.5;
					break;
				}
				case "B0":{
					gradeSwitch = 3.0;
					break;
				}
				case "C+":{
					gradeSwitch = 2.5;
					break;
					
				}
				case "C0":{
					gradeSwitch = 2.0;
					break;
				}
				case "D+":{
					gradeSwitch = 1.5;
					break;
				}
					
				case "D0":{
					gradeSwitch = 1.0;
					break;
				}
				case "F":{
					gradeSwitch = 0.0;
					break;
				}
				
					
				
					
				}
				totalCredit += credit;
				gradeSum = gradeSum + (gradeSwitch * credit);
				
				
				
			}
			
			
		}
		System.out.println(gradeSum / totalCredit);

	}

}
