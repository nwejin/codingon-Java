package _05_Class._02_access_modifier._pack2;

import _05_Class._02_access_modifier._pack1.B;

public class C {
//    A a; // A는 default라 다른 클래스에서 불가
    B b; // B는 public이라 다른 패키지에서 접근 가능

    // C 클래스는 A, B와 패키지가 다르므로
    // default 제한자인 A 클래스는 에러 발생
    // public 제한자인 B 클래스는 가능
}
