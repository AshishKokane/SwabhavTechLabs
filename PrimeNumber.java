import java.util.*;                           // importing util package as it conatins scanner package
class PrimeNumber{                           // code to find prime number
	
	public static void main(String[] args) {
		 Scanner number = new Scanner(System.in);
		 System.out.println("Enter a number to check prime or not");
		 int primeNo = number.nextInt();                    // reading user input
		 
		 int temporary,status = 0;
		 
		 temporary = primeNo/2;
		 
		 if(primeNo ==0 || primeNo ==1) {                      // o and 1 are not prime numbers 
				
				  System.out.println("Not a prime number");     			 
			 
		 }
		 
		 else{
			
			for(int i=2;i<=temporary;i++){                      // prime number is divisible by itself only and 1 so if there is a ;
				if(primeNo%i==0){                                  // greater no like 97 so we will run loop only halfway temporary = primeNumber/2;
					System.out.println("It is not prime number");   // for optimmization;
					status=1;      
					break;      
				}
			}
			
			if (status == 0) {
				 System.out.println("It is a prime number");   
					
			}			 
		}		 	
	}	
}