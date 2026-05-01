import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();

        used.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String cur = words[i];

            char last = prev.charAt(prev.length() - 1);
            char first = cur.charAt(0);

            if (last != first || used.contains(cur)) {
                int person = i % n + 1;
                int turn = i / n + 1;

                return new int[]{person, turn};
            }

            used.add(cur);
        }

        return new int[]{0, 0};
    }
}