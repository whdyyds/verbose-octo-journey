public class Homework09{
	public static void main(String[] args){
		Music m = new Music("rings",120);
		m.play();
		System.out.println(m.getInfo());

	}
}

class Music{
	String name;
	int time;
	public Music(String name, int time){
		this.name = name;
		this.time = time;
	}
	
	public void play(){
		System.out.println("����");
	}
	public String getInfo(){
		return "������Ϊ" + this.name + "����ʱ��Ϊ" + this.time;
	}
}