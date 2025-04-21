

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
        // 길이가 짧은 것부터
        // 길이가 같으면 사전 순으로
        // 단, 중복된 단어는 하나만 남기고 제거해야 한다.

        Set<String> wordSet = new TreeSet<>((word1, word2) -> {
            // 길이가 다르면 길이 기준으로 정렬
            if (word1.length() != word2.length()) {
                return Integer.compare(word1.length(), word2.length());
            }
            // 길이가 같으면 사전 순으로 정렬
            return word1.compareTo(word2);
        });
        
        Scanner scan = new Scanner(System.in);
        int roopTime = scan.nextInt();  // 단어의 개수roopTIme을 입력받음
        scan.nextLine();  // nextInt() 다음에 나오는 개행문자를 처리하기 위한 nextLine()

        for (int i = 0; i < roopTime; i++) {
            String word = scan.nextLine();  // 단어 입력받기
            wordSet.add(word);  
        }

        // 향상된 반복문 출력 
        for (String word : wordSet) {
            System.out.println(word);  
        }
    }
}
