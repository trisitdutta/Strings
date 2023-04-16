
public class CountVCSPCharacters {

	public static void main(String[] args) {
	 
	 String str = "PwSkills@gmail.com";
	 str = str.toLowerCase();
	 int spchCount=0, vowCount=0, consCount=0;
	 for(int i=0;i<str.length();i++)
	 {
	   char c = str.charAt(i);
	   if(c<'a' || c>'z')
	   {
		 spchCount++;
	   }
	   else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	   {
		 vowCount++;
	   }
	   else
	   {
		 consCount++;
	   }
	 }
	 
	   System.out.println("No of vowels in the string = "+ vowCount);
	   System.out.println("No of consonants in the string = "+ consCount);
	   System.out.println("No of special character in the string = "+ spchCount);
   }

}
