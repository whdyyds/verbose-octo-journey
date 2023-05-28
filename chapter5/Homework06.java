public class Homework06{
	public static void main(String[] args){
		int i = 0;
		for(int number = 1;number <= 100;number++){
			if(number % 5 != 0){
				i++;
				System.out.print(number + "\t");
			}
			if(i % 5 == 0){
				System.out.println("");
			}
		}
	}
}