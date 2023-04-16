
public class Palindrome {

	public static void main(String[] args) {
	 String str = "Madam";
	 String newstr = new String();
	 str = str.toLowerCase();
	 for(int i=str.length()-1;i>=0;i--)
	 {
	   newstr += str.charAt(i);
	 }
	 
	 if(str.equals(newstr))
	 {
		System.out.println("String is Palindrome");
	 }
	 else
	 {
	    System.out.println("String is not Palindome");
	 }
	 
  }
}
