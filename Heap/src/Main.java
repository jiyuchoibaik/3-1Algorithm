import java.util.Scanner;

public class Main {
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        if(largest != i){
            int temp1 = arr[largest];
            int temp2 = arr[i];
            arr[i]=temp1;
            arr[largest]=temp2;
            heapify(arr,n,largest);

        }
    }
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        int n = stdln.nextInt();
        int[] arr = new int[n]; //배열 생성 및 초기화

        for(int i = 0; i < n; ++i) { //노드값 입력
            arr[i] = stdln.nextInt();
        }
        heapify(arr,n,0);




    }
}