import java.util.*;    
class Factorial{

	public static void main(String[] args){
      
	  int fact=1;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a number to find factorial ");
      int num = sc.nextInt();
      
      for(int i=num; i>=1; i--)
      {
         fact = fact*i;
      }
      
      System.out.println("\nFactorial of a number is = " +fact);
   }
}

