public class MethodParameter01{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		AA mt = new AA();
		mt.swap(a, b);
		System.out.println("a=" + a + "\tb=" + b);

	}
}

class AA{
	public void swap(int a, int b){
		System.out.println("交换前a=" + a + "\tb=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("交换后a=" + a + "\tb=" + b);
	}
}