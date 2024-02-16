package _05_Class._01_Class;

import java.util.Scanner;

public class Ractangle {

    public static void main(String[] args) {
        System.out.println("사각형 가로 세로 입력");
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Ractangle rectangle = new Ractangle(width, height);
        System.out.println(rectangle.area());
    }

    public int width;
    public int height;


    public Ractangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public int area() {
        return width * height;
    }

}
