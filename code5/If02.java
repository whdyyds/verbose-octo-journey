import java.util.Scanner;
public class If02{
	public static void main(String[] args){
		System.out.println("���������䣺");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age > 18){
			System.out.println("���������18��Ҫ���Լ�����Ϊ�����������");
		}
		else{
			System.out.println("������䲻����ηŹ�����");
		}
	}
}