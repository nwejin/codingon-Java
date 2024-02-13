package _02_control_statement;

import java.util.Scanner;

public class ConditonalStatement {
    public static void main(String[] args) {


        // if 문
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }


        // 문자열 (String) 객체 비교
        System.out.println("이름을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("name 값 확인 : " + name);


        // 문자열 값 비교는 (== 연산자 사용 X)
        // .equals() 메소드 사용!
        if (name.equals("김코딩")) {
            System.out.println("안녕하세요!");
        } else {
            System.out.println("누구세요?");
        }

        // 왜? == 연산자는 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인)
        // .equals() 메소드는 두 객체의 내용이 동일한지 비교

        // "문자열 리터럴"의 경우, java에서 특별 취급
        // 동일한 문자열 리터럴이 사용되는 경우, java 컴파일러는 문자열 풀 (string pool)이라는 공유된 메모리에 저장하고 비교
        // str1, str2 같은 경우 같은 문자열을 가리키고 있으므로 같은 참조값을 가짐
        String str1 = "hello";
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("같은 참조"); // 출력
        } else {
            System.out.println("다른 참조");
        }

        // 문자열 "동적 할당"의 경우, new String(...)을 이용해서 새로운 문자열 객체를 생성 -> 서로 다른 객체를 가리킴
        // str3 와 str4는 서로 다른 객체 => "==" 연산자로 비교 시 false가 나온다!
        // 따라서 문자열 비교시 기본적으로 .equals()메소드를 사용하자!
        String str3 = new String("Hi");
        String str4 = new String("Hi");


        // switch - case 문
        // - 각 case문의 brack문으로 선택 사항, break문 생략 시 바로 옆 case 문으로 넘어간다.
        String dayOfWeek;
        int day = 4;


//        switch (day) {
//            case 1:
//                dayOfWeek = "일요일";
//                break;
//
//            case 2:
//                dayOfWeek = "월요일";
//                break;
//            case 3:
//                dayOfWeek = "화요일";
//                break;
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//                dayOfWeek = "수 ~ 토요일";
//                break;
//            default:
//                dayOfWeek = "잘못된 입력입니다.";
//                break;
//        }

        // 새로운 switch문
        dayOfWeek = switch (day) {
            case 1 -> "일요일";
            case 2 -> "월요일";
            case 3 -> "화요일";
            case 4, 5, 6, 7 -> "수 ~ 토요일";
            default -> "잘못된 입력입니다.";
        };
        System.out.println(dayOfWeek);
    }
}
