

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        기다란 벤치 모양의 식탁에 사람들과 햄버거가 아래와 같이 단위 간격으로 놓여 있다. 사람들은 자신의 위치에서 거리가
//        $K$ 이하인 햄버거를 먹을 수 있다.
//
//        햄버거	사람	햄버거	사람	햄버거	사람	햄버거	햄버거	사람	사람	햄버거	사람
//        1	2	3	4	5	6	7	8	9	10	11	12
//        위의 상태에서
//        $K = 1$인 경우를 생각해보자. 이 경우 모든 사람은 자신과 인접한 햄버거만 먹을 수 있다.
//        10번의 위치에 있는 사람은 11번 위치에 있는 햄버거를 먹을 수 있다. 이 경우 다음과 같이 최대 5명의 사람이 햄버거를 먹을 수 있다.
//
//        2번 위치에 있는 사람: 1번 위치에 있는 햄버거
//        4번 위치에 있는 사람: 5번 위치에 있는 햄버거
//        6번 위치에 있는 사람: 7번 위치에 있는 햄버거
//        9번 위치에 있는 사람: 8번 위치에 있는 햄버거
//        10번 위치에 있는 사람: 11번 위치에 있는 햄버거
//        12번 위치에 있는 사람: 먹을 수 있는 햄버거가 없음
// 
//        $K = 2$인 경우에는 6명 모두가 햄버거를 먹을 수 있다.
//
//        2번 위치에 있는 사람: 1번 위치에 있는 햄버거
//        4번 위치에 있는 사람: 3번 위치에 있는 햄버거
//        6번 위치에 있는 사람: 5번 위치에 있는 햄버거
//        9번 위치에 있는 사람: 7번 위치에 있는 햄버거
//        10번 위치에 있는 사람: 8번 위치에 있는 햄버거
//        12번 위치에 있는 사람: 11번 위치에 있는 햄버거
//        식탁의 길이
//        $N$, 햄버거를 선택할 수 있는 거리
//        $K$, 사람과 햄버거의 위치가 주어졌을 때, 햄버거를 먹을 수 있는 사람의 최대 수를 구하는 프로그램을 작성하시오.

//        Input Example
//        20 1
//        HHPHPPHHPPHPPPHPHPHP


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int distance = Integer.parseInt(st.nextToken());

        char[] bench =  br.readLine().toCharArray();

        int count = 0;

        for(int i = 0; i < N; i++){
            if(bench[i] == 'P'){

                int start = Math.max(0, i - distance);
                int end = Math.min(N - 1, i + distance);

                for(int j = start; j <= end; j++){
                    if(bench[j] == 'H'){
                        count++;
                        bench[j] = 'X';
                        break;
                    }
                }

            }
        }

        System.out.println(count);







//
//        //testing save the array
//        for(int i = 0; i < N; i++){
//            System.out.print(bench[i]);
//        }






    }
}
