import java.util.Arrays;

public class Java20240305Array2 {
    public static void main(String[] args) {
        // 기본자료형의 복사
        int a = 3;
        int b = a;
        System.out.println(a + " " + b); // 3, 3
        b = 5;
        System.out.println(a + " " + b); // 3, 5
        System.out.println();

        // 참조자료형의 복사 ==> 참조복사 또는 주소복사
        int[] intList1 = {3,4,5};
        int[] intList2 = intList1;
        System.out.println(Arrays.toString(intList2));
        intList2[0] = 10;
        System.out.println(Arrays.toString(intList2));
        System.out.println(Arrays.toString(intList1));
        System.out.println();

        // 배열과 for 문의 사용
        // 조건식에 배열의 갯수를 사용
        for (int i=0; i<intList2.length; i++) {
            System.out.println(intList2[i]);
        }
        System.out.println();



    }
}
