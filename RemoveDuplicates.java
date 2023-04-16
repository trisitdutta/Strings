
public class RemoveDuplicates {

	public static void main(String[] args) {
	 
	 String str = "pwskills java";
	 
	 String newstr = new String("");
	 
	 for(int i=0;i<str.length();i++)
	 {
	   char c = str.charAt(i);
	   
	   if(newstr.indexOf(c)>=0)
	   {
		   newstr += "";
	   }
	   else
	   {
		 newstr += c;
	   }
	 }
	   
        System.out.println(newstr);
	}

}
