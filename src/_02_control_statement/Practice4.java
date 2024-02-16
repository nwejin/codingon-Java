package _02_control_statement;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 두 개를 입력하세요");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("덧셈 결과 : " + (x + y));
        System.out.println("빼렘 결과 : " + (x - y));
        System.out.println("나누셈 결과 : " + (x / y));
        System.out.println("곱셈 결과 : " + (x * y));

    }
}