public class YangHui{
	public static void main(String[] args){
		int[][] yanghui = new int[20][];
		for(int i = 0; i < yanghui.length; i++){
			yanghui[i] = new int[i+1];
			for(int j = 0; j < yanghui[i].length; j++){
				if(j == 0 || j == yanghui[i].length - 1){
					yanghui[i][j] = 1;
				} else{
					yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
				}
			}
		}
		for(int i = 0; i < yanghui.length; i++){
			for(int j = 0; j < yanghui[i].length; j++){
				System.out.print(yanghui[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}