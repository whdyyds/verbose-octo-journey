public class MethodExercise01{
	public static void main(String[] args){
		AA mt = new AA();
		boolean key = mt.determine(10);
		System.out.println("ÅĞ¶Ï½á¹ûÎª" + key);
		mt.print(4,4,'#');

	}
}

class AA{
	public boolean determine(int num){
		// boolean result;
		// if(num % 2 == 0){
		// 	result = false;
		// } else{
		// 	result = true;
		// }
		// return result;

		// return num % 2 != 0 ? true; false;

		return num % 2 != 0;
	}

	public void print(int num1, int num2, char ch){
		for(int i = 1; i <= num1; i++){
			for(int j = 1; j <= num2; j++){
				System.out.print(ch);
			}
			System.out.println("");
		}
	}
}