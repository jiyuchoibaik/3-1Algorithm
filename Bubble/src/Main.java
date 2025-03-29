import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        int n = stdln.nextInt();
        int[] arr = new int[n]; //배열 생성 및 초기화

        for(int i = 0; i < n; ++i) { //노드값 입력
            arr[i] = stdln.nextInt();
        }

        for(int i = n; i > 0; --i) {
            for(int j = 0; j < i - 1; ++j) {// 내부 반복문이 한번 실행되면 배열의 맨 오른쪽 노드 제외, 다시 내부 반복문 실행
                if (arr[j] > arr[j + 1]) { //맨왼쪽부터 해당 노드 바로 오른쪽 노드랑 크기를 비교
                    int temp1 = arr[j];
                    int temp2 = arr[j + 1];
                    arr[j] = temp2;
                    arr[j + 1] = temp1;
                }
            }

            for(int j = 0; j < n; ++j) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }

    }
}
