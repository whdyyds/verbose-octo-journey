//import java.util.Scanner;
public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();//����һ���¶���
		p1.speak();
		p1.cal1();
		p1.cal2(5);//�ۼӵ�5
		//�ѷ���getSum���ص�ֵ����returnRes
		int returnRes = p1.getSum(10,20);//num1=10,num2=20
		System.out.println("getSum���Ϊ" + returnRes);
	}
}

class Person{
	String name;
	int age;
	//Scanner sc = new Scanner(System.in);
	//public��ʾ�����ǹ�����
	//void��ʾ����û�з���ֵ
	//speak�Ƿ�����
	//()���β��б�
	//{}�Ƿ����壬дҪִ�еĴ���
	public void speak(){
		System.out.println("����һ������");
	}
	public void cal1(){
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			sum += i;
		}
		System.out.println("cal1���Ϊ" + sum);
	}
	//(int n)�β��б���ʾ��һ���β�n���ɽ����û�����
	public void cal2(int n){
		// System.out.println("������һ����:");
		// int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("cal2���Ϊ" + sum);
	}
	//int��ʾ����ִ�к󷵻�һ��int����
	//return��ʾ��res��ֵ����
	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
}