import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		double score[] = new double[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < score.length; i++){
			System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
			score[i] = sc.nextDouble();
		}
		System.out.println("����Ԫ�����£�");
		for(int i = 0; i < score.length; i++){
			System.out.println("�����" + (i+1) + "��Ԫ�ص�ֵΪ" + score[i]);
		}
	}
}