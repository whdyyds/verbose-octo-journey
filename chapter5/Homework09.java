public class Homework09{
	public static void main(String[] args){
		
		int n = 0;
		for(int i = 1;i <= 100;i++){
			for(int j = 1;j <= i;j++){
				n += j;
			}
			
		}
		System.out.println(n);
	}
}