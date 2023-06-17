public class Homework04{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		A03 a3 = new A03();
		int[] arrNew = a3.copyArr(arr);
		System.out.println("复制的数组为");
		for(int i = 0; i < arrNew.length; i++){
			System.out.print(arrNew[i] + " ");
		}
	}
}

class A03{
	public int[] copyArr(int[] arr){
		int[] arr1 = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			arr1[i] = arr[i];
		}
		return arr1;
	}
}