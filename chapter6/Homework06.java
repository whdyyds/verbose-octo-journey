//写出代码结果


char[] arr1 = {'a', 'z', 'b', 'c'};
char[] arr2 = arr1;
arr1[2] = '韩';

for(int i = 0; i < arr2.length; i++){
	System.out.println(arr1[i] + "," + arr2[i]);
}
//a,a
//韩,韩
//b,b
//c,c