import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = "";
		String password = "";
		label1:
		for(int i = 1;i <= 3;i++){
			System.out.println("请输入用户名：");
			name = sc.next();
			System.out.println("请输入密码：");
			password = sc.next();
			if(name.equals("丁真") && password.equals("666")){
				System.out.println("登录成功！");
				break label1;
			} else{
				int j = 3 - i;
				System.out.println("输入错误，还有" + j + "次机会");
			}
		}
	}

}