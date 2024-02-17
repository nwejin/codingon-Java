package _05_Class._02_access_modifier._pack3;


// 필드와 메소드의 접근 제한자
public class A {
    public int field1; // public field

    int field2; // default

    private int field3; // private

    // constructor (생성자)
    public A() {
        // 클래스 내부임으로 접근 제한자의 영향 X (모두 접근 가능)
        field1 = 1;
        field2 = 2;
        field3 = 3;

        method1();
        method2();
        method3();
    }

    // method 생성
    public void method1() {}

    void method2() {}

    private void method3() {}

}
