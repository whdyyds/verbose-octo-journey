import java.util.Scanner;
public class NestedlfExercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		System.out.println("���������䣺");
		int age = sc.nextInt();
		if(month >= 4 && month <= 10){
			if(age < 18){
				System.out.println("Ʊ��Ϊ" + 30);
			}else if(age >= 18 && age <= 60){
				System.out.println("Ʊ��Ϊ" + 60);
			}else{
				System.out.println("Ʊ��Ϊ" + 20);
			}
		}else{
			if(age >= 18 && age <= 60){
				System.out.println("Ʊ��Ϊ" + 40);
			}else{
				System.out.println("Ʊ��Ϊ" + 20);
			}
		}
	}
}