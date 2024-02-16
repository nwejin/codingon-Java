package _02_control_statement;


// 메서드
// - 객체가 갖는 기능 (동작)

// 매세드 정의

//접근 제한자 리턴타임 매세드_이름 (인자1, 인자 2,...) {
// 메서드 행위
// return 반환값;
// }


public class Method {
    public static void main(String[] args) {
        hello();
        System.out.println(sum1(1,2));
        System.out.println(sum2(1,2));

        // 값전달
        System.out.println(mul1(10,20));

        // 참조 전달
        int[] numbers = {10, 20};
        System.out.println(mul2(numbers));
        System.out.println(mul2(new int[] {10, 30}));
    }

    // 반환값이 없는 메소드 void
    public static void hello() {
        System.out.println("hello java!");
    }

    // 반환값이 있는 메소드
    // "리턴 타입" 과 실제로 반환하는 데이터 형식이 일치해야한다.
    public static int sum1(int x, int y) {
        return x + y;
    }

    public static String sum2(int x, int y) {
        return "x + y" + (x + y);
    }

    // call by value (값 전달)
    public static int mul1(int x, int y) {
        return x * y;
    }

    // call by reference (참조 전달)
    public  static int mul2(int[] nums) {
//        return nums[0] * nums[2];

        // 배열 길이가 2보다 클 때
        int result = 1;
        for (int n: nums) {
            result *= n;
        }
        return result;
    }
}
