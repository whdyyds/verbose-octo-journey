public class Stars{
	public static void main(String[] args){
		for(int i = 1;i <= 5;i++){
			for(int j = 1;j <= 9;j++){
				if((j == 5-(i-1) || j == 5+(i-1)) || i == 5){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				if(j == 9){
					System.out.println(" ");
				}
			}
		}
	}
}