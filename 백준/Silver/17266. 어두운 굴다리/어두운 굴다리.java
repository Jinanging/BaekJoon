

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

//    인하대학교 후문 뒤쪽에는 어두운 굴다리가 있다. 겁쟁이 상빈이는 길이 조금이라도 어둡다면 가지 않는다.
//    따라서 굴다리로 가면 최단거리로 집까지 갈수 있지만, 굴다리는 어둡기 때문에 빙빙 돌아서 집으로 간다.
//    안타깝게 여긴 인식이는 굴다리 모든 길 0~N을 밝히게 가로등을 설치해 달라고 인천광역시에 민원을 넣었다.
//    인천광역시에서 가로등을 설치할 개수 M과 각 가로등의 위치 x들의 결정을 끝냈다. 그리고 각 가로등은 높이만큼 주위를 비출 수 있다.
//    하지만 갑자기 예산이 부족해진 인천광역시는 가로등의 높이가 높을수록 가격이 비싸지기 때문에 최소한의 높이로 굴다리 모든 길 0~N을 밝히고자 한다.
//    최소한의 예산이 들 높이를 구하자. 단 가로등은 모두 높이가 같아야 하고, 정수이다.

//    다음 그림을 보자.
//
//
//    첫 번째 줄에 굴다리의 길이 N 이 주어진다. (1 ≤ N ≤ 100,000)
//
//    두 번째 줄에 가로등의 개수 M 이 주어진다. (1 ≤ M ≤ N)
//
//    다음 줄에 M 개의 설치할 수 있는 가로등의 위치 x 가 주어진다. (0 ≤ x ≤ N)
//
//    가로등의 위치 x는 오름차순으로 입력받으며 가로등의 위치는 중복되지 않으며, 정수이다.
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int length = Integer.parseInt(br.readLine());
    int number = Integer.parseInt(br.readLine());

    int[] tunnel = new int[number];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < number; i++) {
        tunnel[i] = Integer.parseInt(st.nextToken());
    }

    int answer = 0;


    answer = Math.max(answer, tunnel[0]);


    for (int i = 1; i < number; i++) {
        int gap = tunnel[i] - tunnel[i - 1];
        answer = Math.max(answer, (gap + 1) / 2);
    }


    answer = Math.max(answer, length - tunnel[number- 1]);

    System.out.println(answer);
}
}
