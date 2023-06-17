public class Homework02{
	public static void main(String[] args){
		String[] arr = {"jack","mary","tom","lisa","jina"};
		A02 a2 = new A02();
		int res = a2.find("tom",arr);
		System.out.println(res);
	}
}

class A02{
	public int find(String str, String[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i].equals(str)){
				return i;
			}
		}
		return -1;
	}
}