

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stone = scanner.nextInt();

        if(stone%2 ==0){
            System.out.println("CY");
        }
        else{
            System.out.println("SK");
        }

    }
}
