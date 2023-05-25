public class LogicOperator{
	public static void main(String[] args){
		int age = 50;
		if(age > 20 & age < 90){
			System.out.println("ok100");
		}

		int a = 4;
		int b = 9;
		if(a < 1 && ++b < 30){
			System.out.println("ok200");
		}//短路与，++b不运行
		System.out.println("a = " + a + "b = " + b);//a=4,b=9

		if(a < 1 & ++b < 30){
			System.out.println("ok300");
		}//逻辑与，++b运行
		System.out.println("a = " + a + "b = " + b);//a=4,b=10

		if(age > 20 | age < 90){
			System.out.println("ok400");
		}

		if(a > 1 || ++b < 30){
			System.out.println("ok500");
		}//短路或，++b不运行
		System.out.println("a = " + a + "b = " + b);//a=4,b=10

		if(a > 1 | ++b < 30){
			System.out.println("ok600");
		}//逻辑或，++b运行
		System.out.println("a = " + a + "b = " + b);//a=4,b=11

		System.out.println(60 > 20);//输出true
		System.out.println(!(60 > 20));//输出false

		System.out.println((60 > 20) ^ (40 < 30));//前后不同，输出true
		System.out.println((60 > 20) ^ (40 > 30));//前后相同，输出false
	}
}