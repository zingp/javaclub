package test;
import java.util.Scanner;

public class scm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int temp;
		int n = input.nextInt();
		int arr[] = new int[n];
		int[] sortArr = new int[n];

		for (i=0; i <=n-1; i++) {
			arr[i] = input.nextInt();
		}
		input.close();

		// 排序号
		sortArr = bubbleSort(arr, n);
		// 打印第二个到倒数第二个
		for (i=1; i<n-1; i++) {
			if (i==n-2) {
				System.out.print(sortArr[i]);
				break;
			}
			System.out.print(sortArr[i] + " ");
		}
		System.out.println();
    }
    
    // 排序
    public static int[] bubbleSort(int[] A, int n) {
        int i, j;
        for(i=0; i<n; i++) {
            for(j = 1 ; j<n-i;j++){
                if (A[j-1]>A[j]) {
                    swap(A, j-1, j);
                }
            }
        }
        return A;
    }
    
    // 交换数组中的两个数
    private static void swap(int[] array, int first ,int second){
        int temp;
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}