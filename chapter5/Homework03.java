import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
		System.out.println("��������ݣ�");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("����������");
		} else{
			System.out.println("���겻������");
		}
	}
}