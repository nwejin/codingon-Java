package _05_Class._02_access_modifier._pack5;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_0216_01 {


    // 필드 (변수)
    private int width;
    private int height;


    public Practice_0216_01(int width) {
        this.width = width;
    }

    public int getArea() {
        return  width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public void setWidth(int width) {
        this.width = width;
    };

    public void setHeight(int height) {
        this.height = height;
    }

     static int instance = 0;

    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<Practice_0216_01> rectangles = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("사각형의 가로 세로를 띄어쓰기 기준으로 입력해주세요");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            // 0 이 입력되면 종료
            if (width == 0 && height == 0) {
                break;
            }

            // rectangle 객체 생성
            Practice_0216_01 rectangle = new Practice_0216_01(width);

            // 세로 길이 설정
            rectangle.setHeight(height);

            // ArrayList에 Rectangle 객체 추가
            rectangles.add(rectangle);
        }

        // 입력된 rectangle객체들의 정보 출력
        System.out.println("\n 입력된 rectangle 정보");

        for (Practice_0216_01 rectangle: rectangles) {
            System.out.println("가로 길이: " + rectangle.getWidth());
            System.out.println("세로 길이: " + rectangle.getHeight());
            System.out.println("넓이는: " + rectangle.getArea());
            System.out.println("-----------------------------------------");
        }

        scanner.close();
        System.out.println("인스턴스 개수는 ? " + rectangles.size());
    }
}
