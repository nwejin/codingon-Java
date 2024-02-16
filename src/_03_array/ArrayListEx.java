package _03_array;


// Collection Type
// : 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util에 포함시켜 놓음

// List
// - ArrayList

// Set
// - HashSet
// - TreeSet

// Map
// - HashMap
// - Hashtable
// - TreeMap

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용하는 컬렉션
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우 유용
// - 크기를 미리 지정하지 않아도 됨 (동적할당, 일반 배열과 차이점)
// - List 컬렉션은 객체 자체를 저장하는게 아니라, 객체 번지를 저장 -> 동일한 객체를 중복해서 저장 가능 = 동일한 번지 수 저장, null도 가능


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 3. 요소 접근
        System.out.println("첫번째 요소 : " + numbers.get(0));
        System.out.println("두번째 요소 : " + numbers.get(1));

        // 4. 요소 수정
        numbers.set(1, 77);
        System.out.println("numbers : " + numbers); // [10, 77, 30, 40, 50]

        // 5. 요소 삽입
        numbers.add(1, 7);
        System.out.println("numbers : " + numbers); // [10, 7, 77, 30, 40, 50]

        // 6. ArrayList 끼리 연결
        System.out.println(Arrays.asList(99, 33, 44)); // arrayList 반환
        numbers.addAll(Arrays.asList(99,33,44));
        System.out.println("numbers : " + numbers); // [10, 7, 77, 30, 40, 50, 99, 33, 44]

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10)); // 0
        System.out.println(numbers.indexOf(99)); // 6
        System.out.println(numbers.indexOf(40)); // 4

        // 8. 요소 삭제
//        numbers.indexOf(4);
        numbers.remove(4);
        System.out.println("numbers : " + numbers); // [10, 7, 77, 30, 50, 99, 33, 44]

        // 9. 리스트 크기 확인
        System.out.println("리스트 크기 : " + numbers.size());

        // 10. 모든 요소 순회
        for (Integer n : numbers) {
            System.out.println(n + " ");
        }

        // 11. 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers : " + numbers);

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("jin", 29));

        // 동일
        Student student = new Student("jin2", 28);
        students.add(student);
        students.add(new Student("jin3", 27));
        students.add(new Student("jin4", 26));

        System.out.println("학생 수 : " + students.size());
        Student std = students.get(0);

        System.out.println(std.getName() + "학생의 나이는 " + std.getAge());

        System.out.println("전체 학생 : ");
        for (Student std1 : students) {
            System.out.println(std1.getName() + "(" + std1.getAge() + ")");
        }

    }
}


class Student  {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name; }
    public int getAge() {return age; }
}