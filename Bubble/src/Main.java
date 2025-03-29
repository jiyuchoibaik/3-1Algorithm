import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        int n = stdln.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = stdln.nextInt();
        }

        for(int i = n; i > 0; --i) {
            for(int j = 0; j < i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
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
