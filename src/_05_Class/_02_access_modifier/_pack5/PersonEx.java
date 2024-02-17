package _05_Class._02_access_modifier._pack5;

public class PersonEx {
    public static void main(String[] args) {

        Person p1 = new Person("minion");
        Person p2 = new Person("pooh");

        // p1.age = 4 // 필드 직접 변경은 불가능
        p1.setAge(4); // setter 메소드를 이용한 간접적 변경
        System.out.println(p1.getAge());

    }
}
