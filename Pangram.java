
public class Pangram {

	public static void main(String[] args) {
	 
	 String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
	 boolean bool = true;
	 str = str.replace(" ","");
	 
	 char[] arr = str.toCharArray();
	 
	 int[] arr1 = new int[26];
	 
	 for(int i=0;i<arr.length;i++)
	 {
	   int a = arr[i] - 65;
	   arr1[a]++;
	 }
	 
	 for(int i=0;i<arr1.length;i++)
	 {
	   if(arr1[i] == 0)
	   {
		  bool = false;
		  break;
	   }
	 }
	 
	 if(bool)
	 {
		System.out.println("It is a Pangram String");
	 }
	 else
	 {
		System.out.println("It is not a Pangram String");
	 }

	}

}
