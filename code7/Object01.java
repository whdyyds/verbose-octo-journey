public class Object01{
	public static void main(String[] args){
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";


		System.out.println("��һֻè����ϢΪ" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("�ڶ�ֻè����ϢΪ" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
}

class Cat{
	String name;
	int age;
	String color;
}