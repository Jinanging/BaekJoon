

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
//        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int max = 0;
        char resultChar = 0;


        // 전체 소문자로 변환
        String lowerword = word.toLowerCase();
        char[] charWord = lowerword.toCharArray();
        int[] count = new int[26];

        for(int i = 0; i <charWord.length; i++){
            int index = charWord[i] - 'a';
            count[index]++;
        }
        
        for(int i =0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                resultChar = (char)(i + 'a');

                
            }
            else if(count[i]== max){
                resultChar = '?';
            }
        }

        char result = Character.toUpperCase(resultChar);

        System.out.println(result);
        
        
        

       




    }
}
