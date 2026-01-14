

import java.io.*;
import java.util.*;

public class Main {
    static boolean[] S = new boolean[21];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "add":
                    S[Integer.parseInt(st.nextToken())] = true;
                    break;
                case "remove":
                    S[Integer.parseInt(st.nextToken())] = false;
                    break;
                case "check":
                    sb.append(S[Integer.parseInt(st.nextToken())] ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    int x = Integer.parseInt(st.nextToken());
                    S[x] = !S[x];
                    break;
                case "all":
                    Arrays.fill(S, true);
                    break;
                case "empty":
                    Arrays.fill(S, false);
                    break;
            }
        }

        System.out.print(sb);
    }
}
