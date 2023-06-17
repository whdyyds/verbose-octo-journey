public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person("king",20);
		Person p2 = new Person("tom");
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);
		System.out.println("p2.name = " + p2.name);
	}
}

class Person{
	String name;
	int age;
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	public Person(String pName){
		name = pName;
	}
}