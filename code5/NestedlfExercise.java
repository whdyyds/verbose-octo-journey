import java.util.Scanner;
public class NestedlfExercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		if(month >= 4 && month <= 10){
			if(age < 18){
				System.out.println("票价为" + 30);
			}else if(age >= 18 && age <= 60){
				System.out.println("票价为" + 60);
			}else{
				System.out.println("票价为" + 20);
			}
		}else{
			if(age >= 18 && age <= 60){
				System.out.println("票价为" + 40);
			}else{
				System.out.println("票价为" + 20);
			}
		}
	}
}