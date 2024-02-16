package _03_array;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        // 배열 실습
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요!");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int[] pracArray = {a,b,c,d,e};
        System.out.println((double) (a+b+c+d+e) /pracArray.length);
//
//        int [] pracArray = new int[5]; // 길이
//        int sum = 0;
//        for (int i = 0; i < pracArray.length; i++) {
//            intArray[i] = scanner.nextInt();
//            sum += intArray[i];
//        }
//        System.out.println("평균은 " + (double) sum / pracArray.length);

    }
}
