
public class ReverseStringType2 {

	public static void main(String[] args) {
     
	 String str = "Think Twice";
	 String newstr = "";
	 str = str.toLowerCase();
	 String[] arr = str.split(" ");
     
	 for(String elem : arr)
	 {
	   for(int i=elem.length()-1;i>=0;i--)
	   {
		  newstr += elem.charAt(i);
	   }
	    newstr += " ";
	 }
	   System.out.println(newstr);
	   
	}
}
