import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		double score[] = new double[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < score.length; i++){
			System.out.println("请输入第" + (i+1) + "个元素的值");
			score[i] = sc.nextDouble();
		}
		System.out.println("数组元素如下：");
		for(int i = 0; i < score.length; i++){
			System.out.println("数组第" + (i+1) + "个元素的值为" + score[i]);
		}
	}
}