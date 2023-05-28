public class Homework08{
	public static void main(String[] args){
		int i;
		double sum = 0;
		for(i = 1;i <= 100;i++){
			if(i%2==0){
				sum = sum - 1.0 / i;
			} else{
				sum = sum + 1.0 / i;
			}
		}
		System.out.println(sum);
	}
}