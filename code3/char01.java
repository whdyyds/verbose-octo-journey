public class char01{
	public static void main(String[] args){

		char c1 = 'a';
		char c2 = '\t';
		char c3 = '汉';
		char c4 = 97;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//输出的是97表示的字符 unicode
		System.out.println((int)c1);//输出的是'a'对应的数字
		System.out.println('a' + 10);
	}
}