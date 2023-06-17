public class Homework05{
	public static void main(String[] args){
		Circle yuan = new Circle(4);
		System.out.println("圆的周长为" + yuan.circumference() + ",面积为" + yuan.area());
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