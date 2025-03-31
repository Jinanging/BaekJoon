
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		int len = word.length();
		boolean pelindrom = true;
		
		for(int i=0;i<len/2;i++) {
			if(word.charAt(i)!=word.charAt(len-1-i)) {
				pelindrom = false;
			}
		}
		if(pelindrom) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
	}
}