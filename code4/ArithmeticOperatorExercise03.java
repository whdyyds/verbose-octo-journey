public class ArithmeticOperatorExercise03{
	public static void main(String[] args){
		int day = 59;
		int week = day / 7;
		int leftdays = day % 7;
		System.out.println(day + "天合" + week + "个星期零" + leftdays + "天");

		double huashi = 234.5;
		double sheshi = 5.0 / 9 * (huashi - 100);
		System.out.println("华氏温度" + huashi + "对应的摄氏温度为" + sheshi);

	}
}