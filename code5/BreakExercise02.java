import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = "";
		String password = "";
		label1:
		for(int i = 1;i <= 3;i++){
			System.out.println("�������û�����");
			name = sc.next();
			System.out.println("���������룺");
			password = sc.next();
			if(name.equals("����") && password.equals("666")){
				System.out.println("��¼�ɹ���");
				break label1;
			} else{
				int j = 3 - i;
				System.out.println("������󣬻���" + j + "�λ���");
			}
		}
	}

}