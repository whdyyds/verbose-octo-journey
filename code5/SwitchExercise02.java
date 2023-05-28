import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();

		if(score>=0 && score<=100){
			switch((int)(score/60)){
				case 0:
				System.out.println("不合格");
				break;
				case 1:
				System.out.println("合格");
				break;
			}
		}else{
			System.out.println("输入的成绩在0-100之间");
		}
	}
}