public class Homework07{
	public static void main(String[] args){
		Dog d = new Dog("Tom", 10, "��ɫ");
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
		System.out.println("����Ϊ" + this.name + "\t����Ϊ" + this.age + "\t��ɫΪ" + this.color);
	}
}