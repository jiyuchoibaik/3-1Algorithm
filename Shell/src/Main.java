import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        int n = stdln.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = stdln.nextInt();
        }

        int k;
        if((n/2)%2==0){ //간격의 값을 홀수로 설정
            k=n/2+1;
        }else{
            k=n/2;
        }
        System.out.println(k);

        while(k>1){
            for(int m=0;m<k;m++) {//새 배열에서 원배열로 다시 옮길 때 원배열 인덱스

                int a; //하나의 임시 부분 리스트를 위한 배열의 크기 설정
                if (n % k != 0) {
                    a = n / k + 1;
                } else {
                    a = n / k;
                }
                int[] temp = new int[a];


                int j = 0;
                for (int i = m; i < n; i += k) { //새 임시 배열에 노드값 저장
                    temp[j] = arr[i];
                    j++;
                }
                for (int i = 0; i < j; i++) {
                    System.out.print(temp[i] + " ");
                }
                System.out.println();
                //삽입 정렬 들어갈 부분
                int tempIndex = 0, tempValue = 0;
                for (int i = 1; i < j; i++) {
                    if (temp[i] < temp[i - 1]) {
                        for (int h = 0; h < i; h++) {
                            if (temp[h] > temp[i]) {
                                tempIndex = h;
                                tempValue = temp[i];
                                break;
                            }
                        }
                        for (int h = i; h > tempIndex; h--) {
                            temp[h] = temp[h - 1];
                        }
                        temp[tempIndex] = tempValue;
                    }

                }
                //삽입 정렬 후 원 배열에 크기 순으로 삽입할 부분
                int l = m;
                for (int i = 0; i < j; i++) {
                    arr[l] = temp[i];
                    l = l + k;
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();


            }
            if ((k / 2) % 2 == 0) { //새로운 간격값 설정
                k = k / 2 + 1;
            } else {
                k = k / 2;
            }
            System.out.println(k);


        }

        //k=1에 대한 삽입 정렬
        int tempIndex=0,tempValue=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                for(int j=0;j<i;j++){
                    if(arr[j]>arr[i]){
                        tempIndex=j;
                        tempValue=arr[i];
                        break;
                    }
                }for(int j=i;j>tempIndex;j--){
                    arr[j]=arr[j-1];
                }arr[tempIndex]=tempValue;
            }
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();

        }


    }
}