

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER = Integer.parseInt(st.nextToken());
        final int LIMIT = Integer.parseInt(st.nextToken());

        int[] arr = new int[NUMBER];
        int[] count = new int[100001];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < NUMBER; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < NUMBER; right++){
            count[arr[right]]++;
            while(count[arr[right]] > LIMIT){
                count[arr[left]]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}