

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //    찬솔이는 블로그를 시작한 지 벌써
//    $N$일이 지났다.
//
//    요즘 바빠서 관리를 못 했다가 방문 기록을 봤더니 벌써 누적 방문 수가 6만을 넘었다.
//
//    찬솔이는
//    X일 동안 가장 많이 들어온 방문자 수와 그 기간들을 알고 싶다.
//
//    찬솔이를 대신해서
//    X일 동안 가장 많이 들어온 방문자 수와 기간이 몇 개 있는지 구해주자.
//
//    입력
//    첫째 줄에 블로그를 시작하고 지난 일수
//    N와
//    X가 공백으로 구분되어 주어진다.
//
//    둘째 줄에는 블로그 시작
//    1일차부터
//    N일차까지 하루 방문자 수가 공백으로 구분되어 주어진다.
//
//    출력
//    첫째 줄에
//    X일 동안 가장 많이 들어온 방문자 수를 출력한다. 만약 최대 방문자 수가 0명이라면 SAD를 출력한다.
//
//    만약 최대 방문자 수가 0명이 아닌 경우 둘째 줄에 기간이 몇 개 있는지 출력한다.


        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int period = Integer.parseInt(st.nextToken());

            int[] visitor = new int[number];
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int i = 0; i < number; i++) {
                visitor[i] = Integer.parseInt(st2.nextToken());
            }

            int sum = 0;
            for (int i = 0; i < period; i++) {
                sum += visitor[i];
            }

            int max = sum;
            int count = 1;

            for (int i = period; i < number; i++) {
                sum = sum - visitor[i - period] + visitor[i];

                if (sum > max) {
                    max = sum;
                    count = 1;
                } else if (sum == max) {
                    count++;
                }
            }

            if (max == 0) {
                System.out.println("SAD");
            } else {
                System.out.println(max);
                System.out.println(count);
            }
        }
    }










