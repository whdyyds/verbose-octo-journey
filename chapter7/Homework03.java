public class Homework03{
	public static void main(String[] args){
		Book ch = new Book();
		double price = ch.updatePrice(23);
		System.out.println("书的价格为" + price);
	}
}

class Book{
	public double updatePrice(double price){
		if(price > 150){
			return 150;
		} else if(price > 100){
			return 100;
		} else{
			return price;
		}
	}
}