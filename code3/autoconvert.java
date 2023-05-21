public class autoconvert{
	public static void main(String[] args){

		int n1 = 10;
		//float d1 = n1 + 1.1;//结果类型是double，编译时会报错
		float d1 = n1 + 1.1F;//结果类型是float
		//int n2 = 1.1;//double不能转int，会报错
		byte b1 = 10;
		//int n2 = 1;
		//byte b2 = n2;//int不能转byte
		char c1 = b1;//byte和char不能自动转换
		short s1 = 10;
		//short s2 = b1 + s1;//short不能接收int，编译报错
		int n2 = b1 + s1;
		byte b2 = 2;
		byte b3 = b1 + b2;//错误，b1+b2的结果也是int
		
		System.out.println(n1);
		System.out.println(d1);
	}
}