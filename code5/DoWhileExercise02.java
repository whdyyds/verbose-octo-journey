import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args){
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do{
			
			System.out.println("还钱吗？");
			String answer = sc.next();
			switch(answer){
				case "不还":
				System.out.println("五连鞭");
				i = 0;
				break;
				case "还":
				i = 1;
			}
			
		}while(i == 0);
	}
}