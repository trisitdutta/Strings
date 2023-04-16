
public class ContainsAllUniqueCharacters {

	public static void main(String[] args) {
		
	 boolean bool = true;
     String str = "pwskills java";
	 String newstr = new String("");
	 for(int i=0;i<str.length();i++)
	 {
	    char c = str.charAt(i);
	    if(newstr.indexOf(c)>=0)
		  {
		    bool = false;
		    break;
		  }
		  else
		  {
		   newstr += c;
		  }
		 }
	    
	     if(bool)
	     {
	       System.out.println("The string does contain all unique character");
	     }
	     else
	     {
	       System.out.println("The string does not contain all unique character");
	     }
	}
}
