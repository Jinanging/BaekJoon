

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int switchNum = Integer.parseInt(br.readLine());
        int[] arr = new int[switchNum];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < switchNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int studentNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentNum; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());


            if (gender == 1) {
                for (int j = number - 1; j < switchNum; j += number) {
                    arr[j] = 1 - arr[j];
                }
            }

            else {
                int idx = number - 1;
                int left = idx;
                int right = idx;

                while (left - 1 >= 0 && right + 1 < switchNum && arr[left - 1] == arr[right + 1]) {
                    left--;
                    right++;
                }

                for (int j = left; j <= right; j++) {
                    arr[j] = 1 - arr[j];
                }
            }
        }


        for (int i = 0; i < switchNum; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
