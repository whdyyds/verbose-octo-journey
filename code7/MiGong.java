public class MiGong{
	public static void main(String[] args){
		//�ȴ����Թ����ö�ά�����ʾ��map = int[8][7]
		//�涨map��Ԫ��ֵ��0��ʾ�����ߣ�1��ʾ������
		int[][] map = new int[8][7];
		//����������������һ��ȫ������Ϊ1
		for(int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//����������������һ��ȫ������Ϊ1
		for(int j = 1; j < 7; j++){
			map[j][0] = 1;
			map[j][6] = 1;
		}
		//�����ϰ�������Ϊ1
		map[3][1] = 1;
		map[3][2] = 1;
		// map[1][2] = 1;
		// map[2][1] = 1;
		map[2][2] = 1;//���Ի���


		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}

		T t = new T();
		boolean res = t.findway(map,1,1);

		System.out.println("==��·���==");
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

class T{
	//ʹ�õݹ�˼��
	public boolean findway(int[][] map, int i, int j){
		if(map[6][5] == 2){
			return true;
		} else if(map[i][j] == 0){
			map[i][j] = 2;
			if(findway(map, i + 1, j)){
				return true;
			}else if(findway(map, i, j + 1)){
				return true;
			}else if(findway(map, i - 1, j)){
				return true;
			}else if(findway(map, i, j - 1)){
				return true;
			}else{
				map[i][j] = 3;
				return false;
			}
		} else{
			return false;
		}
	}
}