public class ArithmeticOperator{
	public static void main(String[] args){
		///的使用
		System.out.println(10/4);//2，类型为int
		System.out.println(10.0/4);//2.5，类型为double
		double d = 10 / 4;//右侧运算结果类型为int，左边提升精度
		System.out.println(d);//2.0

		// %的使用
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1

		// ++的使用
		int i = 10;
		i++;
		System.out.println("i = " + i);//11
		++i;
		System.out.println("i = " + i);//12
		int j = 8;
		int k = ++j;//k=9,j=9
		System.out.println("k = " + k +"\nj = " + j);
		int m = 8;
		int n = m++;//m=9,n=8
		System.out.println("m = " + m +"\nn = " + n);

	}
}