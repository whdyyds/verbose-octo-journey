public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.println("i = " + i);//10
		System.out.println("i2 = " + i2);//20
		i =--i2;
		System.out.println("i = " + i);//19
		System.out.println("i2 = " + i2);//19

	}
}