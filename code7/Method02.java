public class Method02{
	public static void main(String[] args){
		int[][] map = {{0, 0, 1},{1, 1, 1},{1, 1, 3}};
		MyTools mt = new MyTools();
		mt.printArr(map);
		mt.printArr(map);
		mt.printArr(map);

	}
}

class MyTools{
	public void printArr(int[][] map){
		System.out.println("�������飺");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
	}
}