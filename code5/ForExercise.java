public class ForExercise{
	public static void main(String[] args){
		int i = 0;
		int sum = 0;
		for(int num = 1;num <= 100;num++){
			if(num%9==0){
				System.out.println(num);
				i++;
				sum = sum + num;
			}
		}
		System.out.println("����Ϊ" + i);
		System.out.println("�ܺ�Ϊ" + sum);
	}
}