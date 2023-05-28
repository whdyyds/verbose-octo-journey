import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int number = sc.nextInt();
		if(number > 0){
			System.out.println("该数大于0");
		} else if(number < 0){
			System.out.println("该数小于0");
		} else{
			System.out.println("该数等于0");
		}
	}
}