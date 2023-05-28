public class Homework07{
	public static void main(String[] args){
		char letter = 97;
		char ch = 90;
		for(int i = 1;i <= 26;i++){
			System.out.print(letter + " ");
			letter++;
		}
		System.out.println("");
		for(int j = 1;j <= 26;j++){
			System.out.print(ch + " ");
			ch--;
		}
	}
}