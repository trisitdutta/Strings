
public class PrintDuplicateCharacters {

	public static void main(String[] args) {
	 String str = "pwskills java";
	 String newstr = new String("");
	 System.out.println("Duplicate Characters in the String are :");
	 for(int i=0;i<str.length();i++)
	 {
	   char c = str.charAt(i);
	   if(newstr.indexOf(c)>=0)
	   {
		 System.out.print(c + " ");
	   }
	   else
	   {
		  newstr += c;
	   }
	 }
	 

	}

}
