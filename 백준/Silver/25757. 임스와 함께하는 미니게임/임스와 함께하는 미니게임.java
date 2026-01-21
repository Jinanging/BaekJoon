
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        임스가 미니게임을 같이할 사람을 찾고 있습니다.
//
//        플레이할 미니게임으로는 윷놀이
//        Y, 같은 그림 찾기
//        F, 원카드
//        O가 있습니다. 각각 2, 3, 4 명이서 플레이하는 게임이며 인원수가 부족하면 게임을 시작할 수 없습니다.
//
//                사람들이 임스와 같이 플레이하기를 신청한 횟수
//        $N$과 임스가 플레이할 게임의 종류가 주어질 때, 최대 몇 번이나 임스와 함께 게임을 플레이할 수 있는지 구하시오.
//
//                임스와 여러 번 미니게임을 플레이하고자 하는 사람이 있으나, 임스는 한 번 같이 플레이한 사람과는 다시 플레이하지 않습니다.
//
//        임스와 함께 플레이하고자 하는 사람 중 동명이인은 존재하지 않습니다. 임스와 lms0806은 서로 다른 인물입니다.
//
//        첫 번째 줄에는 사람들이 임스와 같이 플레이하기를 신청한 횟수
//        N과 같이 플레이할 게임의 종류가 주어진다.
//        두 번째 줄부터
//        N개의 줄에는 같이 플레이하고자 하는 사람들의 이름이 문자열로 주어진다.
//
//
//        사람들의 이름은 숫자 또는 영문 대소문자로 구성되어 있다.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int player = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        Set<String> players = new HashSet<>();
        for(int i = 0 ; i < player; i++){
            String name = br.readLine();
            players.add(name);
        }

        switch (game) {
            // -> 는 11에서 지원 안하는듯? 수정 
            case "Y": {
                System.out.println(players.size());
                break;
            }
            case "F" :{
                System.out.println(players.size() / 2);
                break;
            }
            case "O" :{
                System.out.println(players.size() / 3);
                break;
            }
        }

    }
}
