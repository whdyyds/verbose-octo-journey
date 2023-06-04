//写出冒泡排序的代码
import java.util.Scanner;
public class Homework07{
	public static void main(String[] args){
		System.out.println("请输入数组元素数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int temp = 0;
		for(int i = 0; i < n; i++){
			System.out.println("请输入当前元素：");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("输出当前数组：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}