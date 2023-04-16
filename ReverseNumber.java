
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
	 
	  System.out.println("Write a number here : ");
	  
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  sc.nextLine();
	  
	  int temp = num;
	  int rev = 0;
	  while(num>0)
	  {
		 int rem = num%10;
		 rev = rev*10+rem;
		 num = num/10; 
	  }
       System.out.println("Reverse of " + temp + " = " + rev);
	}

}
