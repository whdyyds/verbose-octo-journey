public class LogicOperator{
	public static void main(String[] args){
		int age = 50;
		if(age > 20 & age < 90){
			System.out.println("ok100");
		}

		int a = 4;
		int b = 9;
		if(a < 1 && ++b < 30){
			System.out.println("ok200");
		}//��·�룬++b������
		System.out.println("a = " + a + "b = " + b);//a=4,b=9

		if(a < 1 & ++b < 30){
			System.out.println("ok300");
		}//�߼��룬++b����
		System.out.println("a = " + a + "b = " + b);//a=4,b=10

		if(age > 20 | age < 90){
			System.out.println("ok400");
		}

		if(a > 1 || ++b < 30){
			System.out.println("ok500");
		}//��·��++b������
		System.out.println("a = " + a + "b = " + b);//a=4,b=10

		if(a > 1 | ++b < 30){
			System.out.println("ok600");
		}//�߼���++b����
		System.out.println("a = " + a + "b = " + b);//a=4,b=11

		System.out.println(60 > 20);//���true
		System.out.println(!(60 > 20));//���false

		System.out.println((60 > 20) ^ (40 < 30));//ǰ��ͬ�����true
		System.out.println((60 > 20) ^ (40 > 30));//ǰ����ͬ�����false
	}
}