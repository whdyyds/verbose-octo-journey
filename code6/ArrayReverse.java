public class ArrayReverse{
	public static void main(String[] args){
		int arr[] = {11, 22, 33, 44, 55, 66};
		// int temp = 0;
		// int len = arr.length;
		// for(int i = 0; i < len/2; i++){
		// 	temp = arr[i];
		// 	arr[i] = arr[len - 1 - i];
		// 	arr[len - 1 - i] = temp;
		// }
		// System.out.println("反转后的数组为：");
		// for(int i = 0; i < len; i++){
		// 	System.out.print(arr[i] + "\t");
		//}




		int arr1[] = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
			arr1[j] = arr[i];
		}
		arr = arr1;
		System.out.println("反转后的数组为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}

	}
}