public class VarParameterExercise{
	public static void main(String[] args){
		HspMethod mes = new HspMethod();
		mes.showScore("Tom",80,92,79,85,87);
	}
}

class HspMethod{
	public void showScore(String name, double... nums){
		double res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		System.out.println(name + "的总分为" + res);
	}
}