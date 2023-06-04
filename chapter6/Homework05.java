//随机生成10个整数（1-100）保存到数组，并倒序打印以及求平均值，求最大值和最小值的下标，并查找里面是否有8
public class Homework05{
	public static void main(String[] args){
		int[] arr = new int[10];
		int maxindex = 0;
		int minindex = 0;
		int sum = arr[0];
		int answer = 0;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		System.out.println("打印当前数组为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		for(int i = 1; i < arr.length; i++){
			sum += arr[i];
			if(arr[i] > arr[maxindex]){
				maxindex = i;
			}
			if(arr[i] < arr[minindex]){
				minindex = i;
			}
			if(arr[i] == 8){
				answer = 1;
			}
		}
		System.out.println("");
		int[] arrNew = new int[arr.length];
		for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
			arrNew[i] = arr[j];
		}
		arr = arrNew;
		System.out.println("倒序打印当前数组：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		double avr = sum * 1.0 / arr.length;
		System.out.println("平均值为" + avr);
		System.out.println("最大值下标为" + maxindex);
		System.out.println("最小值下标为" + minindex);
		if(answer == 1){
			System.out.println("数组中有8");
		} else{
			System.out.println("数组中没有8");
		}
	}
}