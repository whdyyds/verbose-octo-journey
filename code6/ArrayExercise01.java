public class ArrayExercise01{
	public static void main(String[] args){
		char arr[] = new char[26];
		
		for(int i = 0; i < 26; i++){
			arr[i] = (char)('A' + i);
			
			System.out.print(arr[i] + " ");
		}
	}
}