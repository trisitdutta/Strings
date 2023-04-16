
public class ReverseString {

	public static void main(String[] args) {
	  
	  String str = "PWSKILLS";
	  String newstr = "";
	  
	  for(int i=str.length()-1;i>=0;i--)
	  {
		newstr += str.charAt(i);
	  }
        
	    System.out.println(newstr);
	}

}
