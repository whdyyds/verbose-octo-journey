import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5};

		Scanner sc = new Scanner(System.in);
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.println("是否进行缩减，当前缩减元素为" + arr[i]);
			char answer = sc.next().charAt(0);
			if(answer == 'y'){
				int arrNew[] = new int[arr.length -1];
				for(int j = 0; j < arrNew.length; j++){
					arrNew[j] = arr[j];
				}
				arr = arrNew;
				if(i == 0){
				System.out.println("只剩最后一个元素，不可缩减");
				break;
				}
				System.out.println("当前数组元素为");
				for(int n = 0; n < arr.length; n++){
				System.out.print(arr[n] + "\t");
				}
				System.out.println("");
			} else{

				System.out.println("你退出了程序，当前数组元素为");
				for(int n = 0; n < arr.length; n++){
				System.out.print(arr[n] + "\t");
				}
				

				break;
			}
			


		}

		
		
		
	}
}