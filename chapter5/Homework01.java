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
		System.out.println("���˿��Ծ���" + i + "��·��");
		System.out.println("������ʣ���Ϊ" + total);
	} 
}