public class VarParameter01{
	public static void main(String[] args){
		Method me = new Method();
		
		System.out.println(me.sum(2,4,21,34));
	}
}

class Method{
	public int sum(int... nums){
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return res;
	}
}