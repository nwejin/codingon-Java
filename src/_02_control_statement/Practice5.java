package _02_control_statement;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        Practice5 result = new Practice5();

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int z = scanner.nextInt();

        System.out.println("반지름"+ x +"인 원의 넓이: " + result.num(x));
        System.out.println("가로"+ z + "세로" + y + "인 직사각형의 넓이: " + result.num(z, y));
        System.out.println("밑변"+ x + "높이" + y + "인 직사각형의 넓이: " + result.num(x, y));

    }

    public double num(double a) {
        return (a * 2) * Math.PI;
    }

    public double num(int a, double b) {
        return (a * b);
    }

    public double num(double a, double b) {
        return (a * b) / 2;
    }

}
