import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		double d = 0;
		double average = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			double sum = 0;
			int count = 0;
			for(int j = 1;j <= 5;j++){
				System.out.println("输入学生成绩：");
				double score = sc.nextDouble();
				sum += score;
				if (score >= 60){
					count++;
				}
			}
			average = sum / 5;
			System.out.println(i + "班的平均成绩为" + average);
			System.out.println(i + "班的及格人数为" + count);
			n += count;
			d += average;
		}
		System.out.println("所有班级的平均成绩为" + d/3);
		System.out.println("所有班级的及格人数为" + n);
	}
}