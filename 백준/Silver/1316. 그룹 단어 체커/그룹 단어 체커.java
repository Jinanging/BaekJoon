
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roopTime = scan.nextInt();
        scan.nextLine(); // 개행 제거

        int count = 0; // 그룹 단어 수

        for (int i = 0; i < roopTime; i++) {
            String word = scan.nextLine();
            boolean[] checked = new boolean[26];
            boolean isGroup = true;

            char prev = 0;

            for (int j = 0; j < word.length(); j++) {
                char current = word.charAt(j);

                // 현재 문자가 이전 문자와 다를 경우 (즉, 연속 문자 아님)
                if (current != prev) {
                    if (checked[current - 'a']) {
                        isGroup = false;
                        break;
                    }
                    checked[current - 'a'] = true; // 처음 나온 문자 체크
                }

                prev = current; // 이전 문자 업데이트
            }

            if (isGroup) {
                count++;
            }
        }

        System.out.println(count);
    }
}

