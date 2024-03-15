package Java240315;

public class Java240315Test2 {
    static void bubble(int[] arr) {
        int n = arr.length; // 입력배열의 길이
        int temp = 0;
        for(int i=0; i < n; i++){         // 입력배열의 길이만큼 반복
            for(int j=1; j < (n-i); j++){ // j=1 부터 (입력배열의 길이-i) => 1씩 점점 작아짐
                if(arr[j-1] > arr[j]){    // 만약 입력배열의 앞쪽이 > 입력배열의 뒤쪽보다 크면
                    temp = arr[j-1];      // 임시저장 변수에 입력배열의 앞쪽 값을 저장
                    arr[j-1] = arr[j];    // 배열의 뒤쪽 값을 앞쪽으로 옮기고 (작은값을 앞쪽으로)
                    arr[j] = temp;        // 배열의 뒤쪽에 큰 값을 넣음
                }

            }
        }
    }

    //int arr[] ={3,60,35,2,45,320,5};

    // i=0, j=1 => [(3, 60), 35, 2, 45, 320, 5]
    // i=0, j=2 => [3, (35, 60), 2, 45, 320, 5]
    // i=0, j=3 => [3, 35, (2, 60), 45, 320, 5]
    // i=0, j=4 => [3, 35, 2, (45, 60), 320, 5]
    // i=0, j=5 => [3, 35, 2, 45, (60, 320), 5]
    // i=0, j=6 => [3, 35, 2, 45, 60, (5, 320)]

    // i=1, j=1 => [(3, 35), 2, 45, 60, 5, 320]
    // i=1, j=2 => [3, (2, 35), 45, 60, 5, 320]
    // i=1, j=3 => [3, 2, (35, 45), 60, 5, 320]
    // i=1, j=4 => [3, 2, 35, (45, 60), 5, 320]
    // i=1, j=5 => [3, 2, 35, 45, (5, 60), 320]

    // i=2, j=1 => [(2, 3), 35, 45, 5, 60, 320]
    // i=2, j=2 => [2, (3, 35), 45, 5, 60, 320]
    // i=2, j=3 => [2, 3, (35, 45), 5, 60, 320]
    // i=2, j=4 => [2, 3, 35, (5, 45), 60, 320]

    // ...

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // 원 배열의 값 출력
        }
        System.out.println();

        bubble(arr); // 큰 순으로 정렬

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // 높은값 순서로 정렬된 배열의 값 출력
        }
    }
}
