import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int number = sc.nextInt();
		if(number > 0){
			System.out.println("��������0");
		} else if(number < 0){
			System.out.println("����С��0");
		} else{
			System.out.println("��������0");
		}
	}
}