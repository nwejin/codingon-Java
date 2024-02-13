package _01_basic_syntax;

public class DataTypes {
    public static void main(String[] args) {
        // 식별자
        char name; // 가능
        int name2; // 뒤쪽 숫자 사용 가능 (맨앞에는 불가능)
        // char for; // 예약어는 사용 불가
        char student_ID$; // 특수 기호는 '_' 와 '$'만 사용 가능

        // 기본형 Primitive Type
        // - 사용 하기 전에 선언되어야 함
        // - OS에 따라 자료형 길이 변하지 않음
        // - '비객체' 타입 => null 값 가질 수 없음
        System.out.println("===기본형===");

        // 정수형 변수 선언
        int x = 10;
        long y = 10000000L; // long 타입은 뒤에 'L' or 'l'을 붙여줘야한다.
        short z = 3545;
        byte b = 123;

        // 실수형 변수 선언
        float a = 3.14f; // float 타입은 뒤에 'F' or 'f'
        double c = 2.421;

        // 문자형
        char ch = 'a';

        // 논리형 변수 선언
        boolean bool = true;

        // 변수 출력
        System.out.println("정수형 변수: " + x + y +z + b);
        System.out.println("정수형 변수: " + a +c);
        System.out.println("문자형 변수: "+ ch);
        System.out.println("논리형 변수: "+ bool);

        ////////////////////////////////////////////////////////
        // 참조형 Reference Type
        // - java.lang.Object 상속 받음
        // - 기본형이 아니면 모두 참조형
        System.out.println("===참조형===");

        // String 참조형 변수 선언과 초기화
        // - Java에서 String 타입은 특별함. 참조형이지만, 기본형저럼 사용함 (불변객체)
        // - 기본 자료형은 "==" 비교하지만, String 객체간 비교는 .equals() 메소드 사용
        String greeting = "Hello, World!";

        // 배열 (Array) 참조형 변수 선언과 초기화
        int[] nums = {1, 2, 3, 4, 5};

        // 클래스 (class) 참조형 변수 선언과 초기화
        Person person = new Person("최진", 29);
        System.out.println(person.getAge());

        // 출력
        System.out.println("sting: " + greeting);

        // 배열 ver, 일반 for문
        System.out.println("배열 변수: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        // 배열 ver2, for-each 문
        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(person.getName() + "," + person.getAge());

    }
}

// 클래스 (추후 배울 예정)
class Person {
    String name;
    int age;

    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}