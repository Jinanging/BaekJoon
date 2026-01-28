
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static class Country {
        int gold, silver, bronze;

        Country(int g, int s, int b) {
            this.gold = g;
            this.silver = s;
            this.bronze = b;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Country[] countries = new Country[N + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            countries[idx] = new Country(g, s, b);
        }

        Country target = countries[K];
        int rank = 1;

        for (int i = 1; i <= N; i++) {
            if (i == K) continue;

            Country cur = countries[i];

            if (cur.gold > target.gold || (cur.gold == target.gold && cur.silver > target.silver) || (cur.gold == target.gold && cur.silver == target.silver && cur.bronze > target.bronze)) {
                rank++;
            }
        }

        System.out.println(rank);
    }
}
