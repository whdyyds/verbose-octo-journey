public class Homework07{
	public static void main(String[] args){
		Dog d = new Dog("Tom", 10, "黄色");
		d.show();
	}
}

class Dog{
	String name;
	int age;
	String color;
	public Dog(String name, int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;
	
	}
	public void show(){
		System.out.println("名字为" + this.name + "\t年龄为" + this.age + "\t颜色为" + this.color);
	}
}