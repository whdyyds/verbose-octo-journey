public class MethodExercise02{
	public static void main(String[] args){
		int[][] arr = {{1, 1, 1},{1, 2, 3},{1, 0, 0}};
		MyTools mt = new MyTools();
		mt.print(arr);

		Person p = new Person();//�����¶���
		Person p2 = mt.copyPerson(p);//���շ���ֵ
		System.out.println("p������ age=" + p.age + ";name=" + p.name);
		System.out.println("p2������ age=" + p2.age + ";name=" + p2.name);
		System.out.println(p==p2);//�ж��Ƿ�Ϊͬһ������
	}
}

class Person{
	String name = "Jack";
	int age = 10;
}

class MyTools{
	public void print(int[][] map){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
	}//������ά����

	public Person copyPerson(Person p2){
		p2 = new Person();
		p2.name = "Jack";
		p2.age = 10;
		return p2;
	}//��¡�¶���
}