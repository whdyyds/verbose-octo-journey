import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		String[] arr = {"��üӥ��","��ëʨ��","��������","��������"};
		Scanner sc = new Scanner(System.in);
		int index = -1;
		System.out.println("���������֣�");
		String name = sc.next();
		for(int i = 0; i < arr.length; i++){
			if(arr[i].equals(name)){
				System.out.println("�ҵ���");
				index = i;
			}
		}
		if(index == -1){
			System.out.println("û�ҵ�");
		}
	}
}