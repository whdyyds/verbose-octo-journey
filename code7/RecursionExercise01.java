public class RecursionExercise01{
	public static void main(String[] args){
		MyTools mt = new MyTools();
		int res = mt.fibonacci(6);
		int sum = mt.peach(1);
		System.out.println("res=" + res);
		System.out.println("��һ����" + sum + "����");
	}
}

class MyTools{
	public int fibonacci(int n){
		if(n==1||n==2){
			return n = 1;
		}else{
			n = fibonacci(n-1) + fibonacci(n-2);
			return n;
		}
	}//쳲���������

	public int peach(int n){
		if(n==10){
			return 1;
		}else{
			return (peach(n+1)+1)*2;
		}
		
	}//���ӳ���
}