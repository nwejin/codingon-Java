package _05_Class._03_static;

import java.util.Scanner;

public class CarculatorEx {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        double circleArea = num1 * num1 *Calculator.pi;

        int plusResult = Calculator.plus(num1, num2);
        int minusResult = Calculator.minus(num1, num2);

        System.out.println("원: " + circleArea);
        System.out.println("더하기: " + plusResult);
        System.out.println("빼기: " + minusResult);


    }

}
