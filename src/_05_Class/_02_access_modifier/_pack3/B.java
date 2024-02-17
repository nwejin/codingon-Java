package _05_Class._02_access_modifier._pack3;

public class B {
    public  void method() {
        A a = new A(); // _pack3.A와 _pack3.B는 서로 같은 패키지임으로 import없이 가져와서 객체 생성 가능

        // 필드 변경
        a.field1 = 11;
        a.field2 = 22;
        // a.field3 X
        // 단 field3는 private field 이기때문에 다른 클래스에서 접근 불가

        // 메소드 호출
        a.method1();
        a.method2();
        // a.method3() 는 private method 이기 때문에 사용 불가
    }



}
