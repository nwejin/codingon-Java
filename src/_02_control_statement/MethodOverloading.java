package _02_control_statement;


// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러개 정의
// 즉, 이름이 같고 매개변수가 타입, 개수, 순서가 다름
// - 동작이 유사할 때 사용하면 유용하다.


// 매서드 앞에 static을 붙이면 매세드가 객체 생성 없이도 사용이 가능하다는걸 의미

public class MethodOverloading {

    public static void main(String[] args) {
        // 1. 객체 생성
        // 클래스 타입, 객체명 new 클래스 타입()
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체 매서드 사용
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(1.1, 2.1));
        System.out.println(ol.add(1, 2, 3));
        System.out.println(ol.add(1.1, 2.1, 3.1));

    }
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

}
