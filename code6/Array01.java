public class Array01{
	public static void main(String[] args){
		double[] hens = {3, 5, 1, 3.4, 2, 50};//������Ϊhens
		double totalWeight = 0;
		for(int i = 0; i < hens.length; i++){
			//System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("������Ϊ" + totalWeight);
		System.out.println("���鳤��Ϊ" + hens.length);
		System.out.println("ƽ������Ϊ" + totalWeight/hens.length);
	}
}