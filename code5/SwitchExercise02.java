import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		System.out.println("������ɼ���");
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();

		if(score>=0 && score<=100){
			switch((int)(score/60)){
				case 0:
				System.out.println("���ϸ�");
				break;
				case 1:
				System.out.println("�ϸ�");
				break;
			}
		}else{
			System.out.println("����ĳɼ���0-100֮��");
		}
	}
}