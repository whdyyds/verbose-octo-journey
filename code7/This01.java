public class This01{
	public static void main(String[] args){
		Dog d1 = new Dog("tom",3);
		System.out.println("d1的hashCode为" + d1.hashCode());
		d1.info();
		Dog d2 = new Dog("tony",2);
		System.out.println("d2的hashCode为" + d2.hashCode());
		d2.info();

	}
}

class Dog{
	String name;
	int age;
	public Dog(String name, int in_age){
		this.name = name;
		this.age = in_age;
		System.out.println(this.hashCode());
	}
	public void info(){
		System.out.println(this.name + " " + this.age + " " + this.hashCode());
	}
}