public class Homework01{
	public static void main(String[] args){
		A01 a1 = new A01();
		double[] arr = {12.3,3.1,7.2,28.6,15.7};
		Double res = a1.max(arr);
		if(res != null){
			System.out.println("最大值为" + res);
		} else{
			System.out.println("输入的数组有误");
		}
	}
}

class A01{
	public Double max(double[] arr){
		if(arr != null && arr.length > 0){
			double max = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(max > arr[i]){
					continue;
				} else{
					max = arr[i];
				}
			}
			return max;
		} else{
			return null;
		}
	}
}