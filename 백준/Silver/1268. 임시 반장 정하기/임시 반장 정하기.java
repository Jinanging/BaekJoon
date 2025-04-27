

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int studentNumber = scan.nextInt();
		
		int[][] studentArray = new int[studentNumber][5];
		
		// 학생수 반정보 배열에 저장 
		
		for(int i = 0; i < studentArray.length; i++) {
			for(int j = 0; j < studentArray[i].length; j++) {
				int classInt = scan.nextInt();
				studentArray[i][j] = classInt;
			}
		}
		
		// 같은반인 횟수를 저장할 배열 생성 
		int[] countArray = new int[studentNumber];
		
		
		// 횟수 비교 시작 
		for (int i = 0; i < studentNumber; i++) {         
		    for (int j = 0; j < studentNumber; j++) {    
		        if (i == j) {
		        	continue; 
		        }
		        for (int k = 0; k < 5; k++) {            
		            if (studentArray[i][k] == studentArray[j][k]) {
		                countArray[i]++;
		                break; // 
		            }
		        }
		    }
		}
		
		int max = countArray[0];
		
		for(int i = 0; i <countArray.length; i++) {
			if(max <= countArray[i]) {
				max = countArray[i];
			}
			
		}
		
		for(int i = 0; i < countArray.length; i++) {
			if(max == countArray[i]) {
				System.out.println(i+1);
				return;
			}
		}
		

		
		
		
		
		
		
		
		
		
		

	}

}
