

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String wordString = scan.nextLine();
		for(int i = 0; i < word.length; i++) {
			if(wordString.contains(word[i])) {
				wordString = wordString.replace(word[i], "a");
				
			}
			
		}
		System.out.println(wordString.length());
	}

}
