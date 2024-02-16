package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

        System.out.println("문자를 입력해 주세요!");

        Scanner scanner = new Scanner(System.in);

        String x = scanner.next();

//        System.out.println(x);

        ArrayList<String> text = new ArrayList<>();
        text.add(x);

        for (String n: text) {
            System.out.println(n + " ");
        }


    }
}
