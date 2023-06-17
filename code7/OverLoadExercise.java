public class OverLoadExercise{
	public static void main(String[] args){
		 Methods mes = new Methods();
		 int res1 = mes.m(5);
		 int res2 = mes.m(3,6);
		 System.out.println(res1);
		 System.out.println(res2);
		 mes.m("·½·¨ÖØÔØ");

		 int max1 = mes.max(45,32);
		 double max2 = mes.max(3.5,6.4);
		 double max3 = mes.max(21.2,23.1,14.7);
		 System.out.println(max1);
		 System.out.println(max2);
		 System.out.println(max3);
	}
}

class Methods{
	public int m(int num1){
		return num1 * num1;
	}
	public int m(int num1, int num2){
		return num1 * num2;
	}
	public void m(String str){
		System.out.println(str);
	}

	public int max(int num1, int num2){
		if(num1 > num2){
			return num1;
		} else{
			return num2;
		}
	}
	public double max(double num1, double num2){
		if(num1 > num2){
			return num1;
		} else{
			return num2;
		}
	}
	public double max(double num1, double num2, double num3){
		double max;
		if(num1 > num2){
			max = num1;
		}else{
			max = num2;
		}
		if(max > num3){
			return max;
		}else{
			max = num3;
			return max;
		}
	}
}