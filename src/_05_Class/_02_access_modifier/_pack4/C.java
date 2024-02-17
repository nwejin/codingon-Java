package _05_Class._02_access_modifier._pack4;

import _05_Class._02_access_modifier._pack3.A;

public class C {

    public  void method() {
        A a = new A(); // _pack3.A와 _pack3.C는 서로 다른 패키지임으로 import
        // 필드 변경
        a.field1 = 11;
//        a.field2 = 22; : default field 이기 때문에 컴파일 에러
        // a.field3; :  private field 이기때문에 다른 클래스에서 접근 불가

        // 메소드 호출
        a.method1();
        // a.method2(); : default method 이기 때문에 불가
        // a.method3() :  private method 이기 때문에 사용 불가
    }
}
