public class IfExercise02{
	public static void main(String[] args){
		int num1 = 12;
		int num2 = 8;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0){
			System.out.println("两个数的和能被3和5整除");
		}
		else{
			System.out.println("两个数的和不能被3和5整除");
		}
	}
}