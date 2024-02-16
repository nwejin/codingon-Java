package _03_array;


// 표준 배열
// 배열
// - 배역에 저장할 자료형 선언하고, 배열 이름과 크기 선언 필수
// JAVA에서는 배열의 원소가 모두 같은 타입
// 정적 할당 (처음에 선언한 배열 크기 변경 불가능)
// 단, ArrayList collection의 경우 동적으로 크기 조절 가능


import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 변수 선언
        // - 두가지 방법이 있으나, 관례적으로는 첫번째 방법 사용
        // 1. 타입[] 변수:
        // 2. 타입 변수[]:
        int[] arr1;
        int arr2[];

        // - 배열 변수는 '참조 변수', 배열도 객체이므로 hip 영역에 생성되고, 배열 변수는 hip 영역에 주소 값을 저장
        // 참조니까 null 저장 가능 (null로 초기화)
        // ex. 타입[] 변수 = null;
        // => 배열 변수가 null 일때 null 값을 가진 상태에서는 변수[인텍스]로 값을 읽거나 저장하게 되면  NullPointerException 예외가 발생
        String[] temp = null;
        System.out.println(temp); // null
        // System.out.println(temp[0]); // NullPointerException 예외 발생

        // 값 목록으로 배열 변수 선언과 배열 생성
        int[] intArray = {13, 23, 15, 28, 7, 11};
        System.out.println("intArray[0] : "+ intArray[0]);
        System.out.println("intArray[3] : "+ intArray[3]);
        System.out.println("intArray[5] : "+ intArray[5]);
        System.out.println("intArray : "+ intArray); // (참조값)주소값 출력 [I@28a418fc
        intArray[3] = 77;
        System.out.println("intArray[3] : "+ intArray[3]);

        // *주의* 중괄호{}로 감싼 목록을 배열 변수에 대입할 때, 배열 변수 미리 선언한 수에는 값 목록을 대입 불가
        char[] charArray;
        // 이미 선언을 한것에 중괄호 목록{}을 대입하는건 불가능 하다.
        // charArray = {'A', 'B', 'C' } // 컴파일 에러
        charArray = new char[]{'A', 'B', 'C'};
        // 배열 변수 선언 시점과, 값 목록 대입하는 시점이 다르면 "new type[]"을 중괄호 앞에 붙여서 대입
        System.out.println(charArray[0]);

        // - new 연산자로 배열 선언과 생성
        // : new 연산자로 배열 처음 생성하면 기본값으로 초기화 된다.
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화 된 값 : " + doubleArray[0]);
        System.out.println("new 연산자로 초기화 된 값 : " + doubleArray[1]);
        doubleArray[0] = 0.1;
        System.out.println("doubleArray[0] : " + doubleArray[0]);

        // 배열 길이
        // 배열 변수.length
        // length 필드는 읽기만 가능, 값 변경은 불가능
        System.out.println("doubleArray.length : " + doubleArray.length);
        // 배열의 길이를 벗어난다면 예외처리됨
        // System.out.println("ArrayIndexOutOfBoundsException(예외처리) : " + doubleArray[doubleArray.length]);

        // 배열 출력
        // - toString(): 배열 내용을 문자열로 변환하여 반환
        // - 배열 이름으로 배열 주소값이 아닌 배열 내부 값을 모두 보고 싶을 떄
        System.out.println("intArray : " + Arrays.toString(intArray));
        System.out.println("doubleArray : " + Arrays.toString(doubleArray));

        // 다차원 배열
        // 배열 안에 또 다른 배열이 존재하는 배열
        // ex) 2 * 3 배열 생성 및 초기화
        int[][] matrix = {{1,2,3}, {4,5,6}};
        // index number가
        // (0,0) (0,1) (0,2)
        // (1,0) (1,1) (1,2)

        // ex) 3 * 2 배열 생성 및 초기화
        int [][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;

        // 3차원 배열 생성 및 초기화
        int[][][] threeDimensionArr = {{{1,2}, {3,4}}, {{5,6}, {7,8}}};
        System.out.println("matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matrix2 : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("threeDimensionArr : ");
        for (int i = 0; i < threeDimensionArr.length; i++) {
            for (int j = 0; j < threeDimensionArr[i].length; j++) {
                for (int k = 0; k < threeDimensionArr[i][j].length ; k++) {
                    System.out.print(threeDimensionArr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        // Arrays 매세드
        // 배열 복사
        // - 배열은 크기 고정임으로 더 많은 저장 공간 필요하면 더 큰 길이의 배열을 새로 만들어서 기존 배열을 복사

        // ver1. 반복문으로 요소 하나씩 복사
        int[] originalArray = {1,2,3};
        int[] newArray = new int[5];

        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        System.out.println(Arrays.toString(newArray)); // [1,2,3,0,0]

        // ver2. arraycopy() 메서드 사용
        // System.arraycopy(object src, int srcPost, object dest, int destPost, int length)
        // object src : 원본 배열
        // int srcPost : 원본 배열 복사 시작 할 인덱스
        // object dest : 새 배열
        // int destPost : 새 배열에 붙여넣기 시작 할 인덱스
        // length : 복사 항목 수

        String[] originalFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];

        System.arraycopy(originalFruits, 0, newFruits, 1, originalFruits.length);
        System.out.println(Arrays.toString(newFruits));

        // Arrays 메소드
        // copyOf(arr, copyArrLength)
        int[] originalArr = {1,2,3,4,5};
        int[] copiedArr = Arrays.copyOf(originalArr, 3); // 배열, 길이
        System.out.println("copiedArr : " + Arrays.toString(copiedArr));

        // copyOfRange(arr, sIdx, eIdx)
        int[] rangeArr = Arrays.copyOfRange(originalArr, 1, 2); // 배열, 시작, 끝
        System.out.println("rangeArr : " + Arrays.toString(rangeArr));

        // fill(arr, n)
        int[] filledArr = new int[5];
        System.out.println("fill 전 : " + Arrays.toString(filledArr));
        Arrays.fill(filledArr, 7); // 배열, 채울 값
        System.out.println("fill 후 : " + Arrays.toString(filledArr));

        // sort(arr) : 오름차순 정렬
        int[] unsortedArr = {4,5,3,7,6,1,2};
        Arrays.sort(unsortedArr);
        System.out.println("sort 정렬 : " + Arrays.toString(unsortedArr));

        // euqals(arr1, arr2) 배열이 동일한지 비교하여 boolean 출력
        int[] equalArr1 = {1,2,3};
        int[] equalArr2 = {1,2,3};
        int[] equalArr3 = {4,2,3};

        boolean arraysEqual = Arrays.equals(equalArr1, equalArr2);
        boolean arraysEqual2 = Arrays.equals(equalArr1, equalArr3);
        System.out.println("1 vs 2 : equals " + arraysEqual);
        System.out.println("1 vs 3 : equals " + arraysEqual2);

        // == 비교
        System.out.println("1 vs 2 : == "+ (equalArr1 == equalArr2)); // false

        // deepEquals(arr1, arr2)
        int[][] deepArr1 = {{1,2}, {3,4}};
        int[][] deepArr2 = {{1,2}, {3,4}};
        int[][] deepArr3 = {{5,2}, {3,4}};

        boolean deepEqual = Arrays.deepEquals(deepArr1, deepArr2);
        boolean deepEqual2 = Arrays.deepEquals(deepArr1, deepArr3);
        System.out.println("deepEqual : " + deepEqual);
        System.out.println("deepEqual2 : " + deepEqual2);

        // binarySearch(arr, val) 메소드 (단, 배열은 정렬된 상태여야함 => sort)
        int[] sortedArr = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(sortedArr, 30); // 배열, 찾을 값
        System.out.println("index of 30 : " + index);



    }
}
