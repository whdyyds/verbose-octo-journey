public class ArithmeticOperator{
	public static void main(String[] args){
		///��ʹ��
		System.out.println(10/4);//2������Ϊint
		System.out.println(10.0/4);//2.5������Ϊdouble
		double d = 10 / 4;//�Ҳ�����������Ϊint�������������
		System.out.println(d);//2.0

		// %��ʹ��
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1

		// ++��ʹ��
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