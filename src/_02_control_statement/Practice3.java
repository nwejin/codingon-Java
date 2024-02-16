package _02_control_statement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        };
    }
}
