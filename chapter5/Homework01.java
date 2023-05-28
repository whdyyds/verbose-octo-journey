public class Homework01{
	public static void main(String[] args){
		double total = 100000;
		int i = 0;
		while(total > 50000){
			total = total * 0.95;
			i++;
		}
		while(total >= 0){
			total = total - 1000;
			i++;
			if(total < 1000){
				break;
			}
			
		}
		System.out.println("该人可以经过" + i + "次路口");
		System.out.println("该人所剩金额为" + total);
	} 
}