import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		String[] arr = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner sc = new Scanner(System.in);
		int index = -1;
		System.out.println("请输入名字：");
		String name = sc.next();
		for(int i = 0; i < arr.length; i++){
			if(arr[i].equals(name)){
				System.out.println("找到了");
				index = i;
			}
		}
		if(index == -1){
			System.out.println("没找到");
		}
	}
}