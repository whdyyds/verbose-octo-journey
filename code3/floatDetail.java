public class floatDetail{
	public static void main(String[] args){

		double n1 = 1.1;
		float n2 = 1.1F;
		double n3 = 1.1F;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);//2.1234567851
		System.out.println(num10);//2.1234567
		double num11 = 2.7;
		double num12 = 8.1/3;
		System.out.println(num11);//2.7
		System.out.println(num12);//2.6666666666669
		if(Math.abs(num11-num12)<0.000001){
			System.out.println("差值非常小，达到规定精度，认为相等")；
		}
		System.out.println(Math.abs(num11 - num12));
	}
}