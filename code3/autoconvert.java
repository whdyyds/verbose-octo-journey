public class autoconvert{
	public static void main(String[] args){

		int n1 = 10;
		//float d1 = n1 + 1.1;//���������double������ʱ�ᱨ��
		float d1 = n1 + 1.1F;//���������float
		//int n2 = 1.1;//double����תint���ᱨ��
		byte b1 = 10;
		//int n2 = 1;
		//byte b2 = n2;//int����תbyte
		char c1 = b1;//byte��char�����Զ�ת��
		short s1 = 10;
		//short s2 = b1 + s1;//short���ܽ���int�����뱨��
		int n2 = b1 + s1;
		byte b2 = 2;
		byte b3 = b1 + b2;//����b1+b2�Ľ��Ҳ��int
		
		System.out.println(n1);
		System.out.println(d1);
	}
}