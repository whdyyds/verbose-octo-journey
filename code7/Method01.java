//import java.util.Scanner;
public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();//创建一个新对象
		p1.speak();
		p1.cal1();
		p1.cal2(5);//累加到5
		//把方法getSum返回的值赋给returnRes
		int returnRes = p1.getSum(10,20);//num1=10,num2=20
		System.out.println("getSum结果为" + returnRes);
	}
}

class Person{
	String name;
	int age;
	//Scanner sc = new Scanner(System.in);
	//public表示方法是公开的
	//void表示方法没有返回值
	//speak是方法名
	//()是形参列表
	//{}是方法体，写要执行的代码
	public void speak(){
		System.out.println("我是一个好人");
	}
	public void cal1(){
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			sum += i;
		}
		System.out.println("cal1结果为" + sum);
	}
	//(int n)形参列表，表示有一个形参n，可接收用户输入
	public void cal2(int n){
		// System.out.println("请输入一个数:");
		// int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("cal2结果为" + sum);
	}
	//int表示方法执行后返回一个int数据
	//return表示把res的值返回
	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
}