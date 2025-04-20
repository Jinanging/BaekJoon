

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] alphaCheck = new boolean[26];
        Scanner scan = new Scanner(System.in);
        int roopTime = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < roopTime; i++) {
            String option = scan.nextLine();
            String[] words = option.split(" ");
            boolean found = false;

            int idx = 0;
            for (String word : words) {
                char c = word.charAt(0);
                int alphaIdx = Character.toLowerCase(c) - 'a';
                if (!alphaCheck[alphaIdx]) {
                    alphaCheck[alphaIdx] = true;
                    // 대괄호로 감싸기
                    int start = idx;
                    int end = idx + 1;
                    System.out.println(option.substring(0, start) + "[" + c + "]" + option.substring(end));
                    found = true;
                    break;
                }
                idx += word.length() + 1; // 공백 포함
            }

            if (!found) {
                for (int j = 0; j < option.length(); j++) {
                    char c = option.charAt(j);
                    if (c == ' ') continue;
                    int alphaIdx = Character.toLowerCase(c) - 'a';
                    if (!alphaCheck[alphaIdx]) {
                        alphaCheck[alphaIdx] = true;
                        System.out.println(option.substring(0, j) + "[" + c + "]" + option.substring(j + 1));
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println(option);
            }
        }
        scan.close();
    }
}
