import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		System.out.println("输入一个三位数：");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a = number / 100;
		int b = (number / 10) % 10;
		int c = number % 10;
		if (a * a * a + b * b * b + c * c * c == number){
			System.out.println(number + "是水仙花数");
		}else{
			System.out.println(number + "不是水仙花数");
		}


		}
}