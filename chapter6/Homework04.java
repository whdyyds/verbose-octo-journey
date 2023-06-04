//已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序。
//[10, 12, 45, 90]的数组添加23
import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		int[] arr = {10, 12, 45, 90};
		Scanner sc = new Scanner(System.in);
		System.out.println("输入添加元素：");
		int num = sc.nextInt();
		int[] arrNew = new int[arr.length + 1];
		int index = -1;
		for(int i = 0; i < arr.length; i++){
			if(num <= arr[i]){
				index = i;
				break;
			}
		}
		if(index == -1){
			arrNew[arrNew.length - 1] = num;
			for(int i = 0; i < arr.length; i++){
				arrNew[i] = arr[i];
			}
		}else{
			for(int i = 0, j = 0; i < arrNew.length; i++){
				if(i == index){
					arrNew[i] = num;
					continue;
				}else{
					arrNew[i] = arr[j];
					j++;
				}
			}
		}
		// if(num > arr[arr.length - 1]){
		// 	arrNew[arrNew.length - 1] = num;
		// 	for(int i = 0; i < arr.length; i++){
		// 		arrNew[i] = arr[i];
		// 	}
		// } else{
		// 	for(int i = 0; i < arr.length; i++){
		// 		if(num > arr[i]){
		// 			arrNew[i] = arr[i];
		// 		} else{
		// 			index = i;
		// 			break;
		// 		}
		// 	}
		// 	arrNew[index] = num;
		// 	for(int i = index + 1; i < arrNew.length; i++){
		// 		arrNew[i] = arr[i - 1];
		// 	}
		// }
		for(int i = 0; i < arrNew.length; i++){
			System.out.print(arrNew[i] + " ");
		}
	}
}