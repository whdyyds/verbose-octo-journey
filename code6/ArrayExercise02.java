public class ArrayExercise02{
	public static void main(String[] args){
		int arr[] = {4, -1, 9, 10, 23, 34, 74, 21};
		int max = arr[0];
		int number = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
				number = i;
			}
		}
		System.out.println("��������ֵΪ" + max);
		System.out.println("���ֵ��Ӧ���±�Ϊ" + number);
	}
}