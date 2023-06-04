public class Array01{
	public static void main(String[] args){
		double[] hens = {3, 5, 1, 3.4, 2, 50};//数组名为hens
		double totalWeight = 0;
		for(int i = 0; i < hens.length; i++){
			//System.out.println("第" + (i+1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重为" + totalWeight);
		System.out.println("数组长度为" + hens.length);
		System.out.println("平均体重为" + totalWeight/hens.length);
	}
}