public class Homework06{
	public static void main(String[] args){
		Cale cal1 = new Cale(12.0,3.0);
		Cale cal2 = new Cale(12.0,0);
		System.out.println("两个数的和为" + cal1.add());
		System.out.println("两个数的差为" + cal1.sub());
		System.out.println("两个数的积为" + cal1.mul());
		if(cal1.div() != null){
			System.out.println("两个数的商为" + cal1.div());
		} else{
			System.out.println("除数为0，请重新输入");
		}
		System.out.println("===============");
		System.out.println("两个数的和为" + cal2.add());
		System.out.println("两个数的差为" + cal2.sub());
		System.out.println("两个数的积为" + cal2.mul());
		if(cal2.div() != null){
			System.out.println("两个数的商为" + cal2.div());
		} else{
			System.out.println("除数为0，请重新输入");
		}
	}
}

class Cale{
	double num1;
	double num2;
	public Cale(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public double add(){
		return num1 + num2;
	}
	public double sub(){
		return num1 - num2;
	}
	public double mul(){
		return num1 * num2;
	}
	public Double div(){
		if(num2 != 0){
			return num1 / num2;
		} else{
			return null;
		}
	}
}