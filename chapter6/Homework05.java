//�������10��������1-100�����浽���飬�������ӡ�Լ���ƽ��ֵ�������ֵ����Сֵ���±꣬�����������Ƿ���8
public class Homework05{
	public static void main(String[] args){
		int[] arr = new int[10];
		int maxindex = 0;
		int minindex = 0;
		int sum = arr[0];
		int answer = 0;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		System.out.println("��ӡ��ǰ����Ϊ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		for(int i = 1; i < arr.length; i++){
			sum += arr[i];
			if(arr[i] > arr[maxindex]){
				maxindex = i;
			}
			if(arr[i] < arr[minindex]){
				minindex = i;
			}
			if(arr[i] == 8){
				answer = 1;
			}
		}
		System.out.println("");
		int[] arrNew = new int[arr.length];
		for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
			arrNew[i] = arr[j];
		}
		arr = arrNew;
		System.out.println("�����ӡ��ǰ���飺");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		double avr = sum * 1.0 / arr.length;
		System.out.println("ƽ��ֵΪ" + avr);
		System.out.println("���ֵ�±�Ϊ" + maxindex);
		System.out.println("��Сֵ�±�Ϊ" + minindex);
		if(answer == 1){
			System.out.println("��������8");
		} else{
			System.out.println("������û��8");
		}
	}
}