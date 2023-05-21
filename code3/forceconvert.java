public class forceconvert{
	public static void main(String[] args){

		int n1 = (int)1.9;
		int n2 = 2000;
		byte b1 = (byte)n2;
		//int n3 = (int)10 * 3.5 + 6 * 1.5;//运算结果为double，编译错误
		int n3 = (int)(10 * 3.5 +6 * 1.5);//(int)44.0
		System.out.println("n1=" + n1);//输出1，造成精度损失
		System.out.println("b1=" + b1);//造成数据溢出
		System.out.println(n3);

		char c1 = 100;
		int m = 100;
		//char c2 = m;//编译错误
		char c2 = (char)m;
		System.out.println(c2);//输出100对应的字符

	}
}