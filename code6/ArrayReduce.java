import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5};

		Scanner sc = new Scanner(System.in);
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.println("�Ƿ������������ǰ����Ԫ��Ϊ" + arr[i]);
			char answer = sc.next().charAt(0);
			if(answer == 'y'){
				int arrNew[] = new int[arr.length -1];
				for(int j = 0; j < arrNew.length; j++){
					arrNew[j] = arr[j];
				}
				arr = arrNew;
				if(i == 0){
				System.out.println("ֻʣ���һ��Ԫ�أ���������");
				break;
				}
				System.out.println("��ǰ����Ԫ��Ϊ");
				for(int n = 0; n < arr.length; n++){
				System.out.print(arr[n] + "\t");
				}
				System.out.println("");
			} else{

				System.out.println("���˳��˳��򣬵�ǰ����Ԫ��Ϊ");
				for(int n = 0; n < arr.length; n++){
				System.out.print(arr[n] + "\t");
				}
				

				break;
			}
			


		}

		
		
		
	}
}