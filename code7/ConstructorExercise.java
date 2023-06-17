public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person("Jack",29);
		System.out.println("p1的信息为：name=" + p1.name + " age=" + p1.age);
		System.out.println("p2的信息为：name=" + p2.name + " age=" + p2.age);
	}
}
class Person{
	String name;
	int age;
	public Person(){
		age = 18;
	}

	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}