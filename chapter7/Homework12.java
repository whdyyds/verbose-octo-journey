public class Homework12{
	public static void main(String[] args){

	}
}

class Employee{
	String name;
	String gender;
	int age;
	String position;
	double salary;

	public Employee(String name, String gender, int age, String position, double salary){
		this(name,gender,age);
		this.position = position;
		this.salary = salary;
	}

	public Employee(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee(String position, double salary){
		this.position = position;
		this.salary = salary;
	}

	public void print(Employee emp){
		System.out.println(emp.name + emp.gender + emp.age + emp.position + emp.salary);
	}
}