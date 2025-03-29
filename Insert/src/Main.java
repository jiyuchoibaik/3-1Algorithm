import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdln=new Scanner(System.in);
        int n=stdln.nextInt();
        int arr[]=new int[n]; //배열 생성 및 초기화

        for(int i=0;i<n;i++){ //배열 노드 초기화
            arr[i]=stdln.nextInt();
        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }System.out.println();
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