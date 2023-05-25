public class TernaryOperator{
	public static void main(String[] args){
		int a = 10;
		int b = 99;
		int result = a > b ? a ++ : b --;
		System.out.println(result);//99，b = 98
		int c = a > b ? (int) 1.1 : (int) 3.4;
		double d = a > b ? a : b + 3;
		System.out.println(c);//3
		System.out.println(d);//101.0
	}
}