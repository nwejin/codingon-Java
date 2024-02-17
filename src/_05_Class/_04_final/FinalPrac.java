package _05_Class._04_final;

import java.util.Scanner;

public class FinalPrac {
    public static final double PI = 3.141592;

    public final double radius;


    public FinalPrac(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius* radius * PI;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요:");
        double radius = scanner.nextDouble();


        FinalPrac circle = new FinalPrac(radius);
        System.out.println("원의 반지름: " + circle.radius);

        System.out.println("원의 넓이: " + circle.calculateArea());

        scanner.close();
    }
}
