package _05_Class._04_final;

public class Student {
    // final 필드

    final String name = "최진"; // 1. 필드 선언 시 초기화

    final String sid;
    public Student(String sid) {
        this.sid = sid;
    }

    public static void main(String[] args) {
        Student std1 = new Student("S001");
        System.out.println(std1.name);
        System.out.println(std1.sid);

        // final 필드 값 변경 불가능
        // std1.name = "홍길동"; // 에러
    }
}
