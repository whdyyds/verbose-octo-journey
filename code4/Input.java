import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������֣� ");
		String name = myScanner.next();
		System.out.println("���������䣺 ");
		int age = myScanner.nextInt();
		System.out.println("������нˮ�� ");
		double salary = myScanner.nextDouble();
		System.out.println("�˵Ļ�����Ϣ���£� ");
		System.out.println("����Ϊ" + name + "����Ϊ" + age + "нˮΪ" + salary);
	}
}