public class AssignOperator{
	public static void main(String[] args){
		int num = 10;
		num += 4;
		System.out.println(num);//14
		num /= 3;
		System.out.println(num);//4

		byte b = 3;
		b += 2;//µÈ¼ÛÓÚb = (byte)(b+2)
		System.out.println(b);
	}
}