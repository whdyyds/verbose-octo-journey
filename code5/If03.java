import java.util.Scanner;
public class If03{
	public static void main(String[] args){
		System.out.println("������֥�����÷֣�");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if(score >= 1 && score <= 100){

		if(score == 100){
			System.out.println("���ü���");
		} else if(score > 80 && score <= 99){
			System.out.println("��������");
		} else if(score >=60 && score <= 80){
			System.out.println("����һ��");
		} else {
			System.out.println("���ò�����");
		}

	} else {
		System.out.println("������������������");
	}
	}
}