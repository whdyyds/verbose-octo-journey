public class Homework05{
	public static void main(String[] args){
		Circle yuan = new Circle(4);
		System.out.println("Բ���ܳ�Ϊ" + yuan.circumference() + ",���Ϊ" + yuan.area());
	}
}

class Circle{
	double r;
	public Circle(double r){
		this.r = r;
	}
	public double circumference(){
		return Math.PI * r * 2.0;
	}
	public double area(){
		return Math.PI * r * r;
	}
}