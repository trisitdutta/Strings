
public class MaxOccuringCharacter {

	public static void main(String[] args) {
     
    String str = "pwskills java course";
    
    str = str.replace(" ", "");
    
    int[] arr = new int[26];
    
    for(int i=0;i<str.length();i++)
    {
       int n = str.charAt(i) - 97;
        arr[n]++;
    }
    
    int max = 0,index=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>max)
      {
    	max = arr[i];
        index = i;
      }
    }
     char maxOccChar = (char)(index+97);
     System.out.println("Max occuring character is : " + maxOccChar);

	}

}
