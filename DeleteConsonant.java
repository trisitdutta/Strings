
public class DeleteConsonant {

	public static void main(String[] args) {
	
	 String str = "Hello, have a good day";
	 str = str.toLowerCase();
	 String newstr = "";
	 
	 for(int i=0;i<str.length();i++)
	 {
		char c = str.charAt(i);
	   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='w'
		   ||c=='y'||c<'a' || c>'z')  //'w' & 'y' are semi-vowels.
	   {
		  newstr += c;
	   }
	 }
	 
	 System.out.println(newstr);

	}
}
