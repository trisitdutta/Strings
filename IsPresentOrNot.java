
public class IsPresentOrNot {

	public static void main(String[] args) {
	 
	 String str = "Umbrella";
	 boolean bool = false;
	 
	 for(int i=0;i<str.length();i++)
	 {
	   if(str.charAt(i)=='e' || str.charAt(i)=='E')
	    {
		   bool = true;
		   break;
	    }
	 }
	 
	 if(bool)
	 {
	   System.out.println("Present");
	 }
	 else
	 {
	   System.out.println("Not present");
	 }

	}

}
