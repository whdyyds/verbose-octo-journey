import java.util.Scanner;
public class Nestedlf{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = sc.nextDouble();
		System.out.println("�������Ա�");
		char gender = sc.next().charAt(0);
		if(score > 8.0){
			if(gender == '��'){
				System.out.println("����������");
			}else if(gender == 'Ů'){
				System.out.println("����Ů����");
			}
		}else{
			System.out.println("��̭");
		}
	}
}