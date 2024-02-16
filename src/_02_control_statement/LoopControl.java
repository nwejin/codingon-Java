package _02_control_statement;

public class LoopControl {
    public static void main(String[] args) {

        // 기본 for문
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while문
        // - 조건식이 참일 동안 while 블럭 실행
        int i = 1;
        while (i <=10) {
            System.out.println(i);
            i++;
        }

        // do-while문
        // - 적어도 한번은 수행되는 반복문
        // - while문과 다르게 조건식이 뒤에 배치
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j >= 10);


        // for-each문
        // collection type 데이터에서 데이터가 존재하는 개수만큼 반복해서 실행
        // *collection type: 데이터 저장하고 관리하는 자료구조를 제공하는 클래스 모음
        // ex) List, Set, Map 등등

        // ABC 배열 반복
        String[] array = {"A", "B", "C"};
        for (String a: array) {
            System.out.println("a = " + a);
        }

    }
}
