import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		System.out.println("����һ����λ����");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a = number / 100;
		int b = (number / 10) % 10;
		int c = number % 10;
		if (a * a * a + b * b * b + c * c * c == number){
			System.out.println(number + "��ˮ�ɻ���");
		}else{
			System.out.println(number + "����ˮ�ɻ���");
		}


		}
}