import java.util.Scanner;

public class Main {
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) { //왼쪽 자녀노드와 값 비교
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) { // 오른쪽 자녀노드와 값 비교
            largest = right;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        if(largest != i){ //만약 자녀 노드 중 더 큰 값이 존재하면 자녀노드와 부모노드의 값을 바꿈
            int temp1 = arr[largest];
            int temp2 = arr[i];
            arr[i]=temp1;
            arr[largest]=temp2;
            heapify(arr,n,largest); //자녀노드도 힙 정렬

        }

    }
    public static void heapDelete(int[] arr,int n,int d){
        arr[d]=arr[n-1];
        arr[n-1]= -1;
        heapify(arr,n,0);



    }
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        int n = stdln.nextInt();
        int[] arr = new int[n]; //배열 생성 및 초기화

        for(int i = 0; i < n; ++i) { //노드값 입력
            arr[i] = stdln.nextInt();
        }
        heapify(arr,n,0);

        System.out.print("삭제할 노드의 인덱스를 입력하시오:");
        int d=stdln.nextInt();
        heapDelete(arr,n,d);




    }
}