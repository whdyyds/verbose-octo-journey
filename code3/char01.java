public class char01{
	public static void main(String[] args){

		char c1 = 'a';
		char c2 = '\t';
		char c3 = '��';
		char c4 = 97;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//�������97��ʾ���ַ� unicode
		System.out.println((int)c1);//�������'a'��Ӧ������
		System.out.println('a' + 10);
	}
}