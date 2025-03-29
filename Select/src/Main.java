import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdln=new Scanner(System.in);
        int n=stdln.nextInt();
        int arr[]=new int[n]; //배열 생성 및 초기화

        for(int i=0;i<n;i++){ //배열 노드 초기화
            arr[i]=stdln.nextInt();
        }
        int j;
        for(j=n;j>0;j--){
            int i,index=0,max=arr[0];
            for(i=0;i<j;i++){ //최댓값을 가진 노드 찾기
                if(arr[i]>max){
                    max=arr[i];
                    index=i;
                }
            }
            int temp=max,temp2;
            for(int k=index;k<(j-1);k++){//최댓값 제외 재배열하기
                arr[k]=arr[k+1];
            }
            arr[j-1]=temp; //최댓값을 배열의 맨 오른쪽에 저장
            for(i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}