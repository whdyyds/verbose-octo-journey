import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args){
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do{
			
			System.out.println("��Ǯ��");
			String answer = sc.next();
			switch(answer){
				case "����":
				System.out.println("������");
				i = 0;
				break;
				case "��":
				i = 1;
			}
			
		}while(i == 0);
	}
}