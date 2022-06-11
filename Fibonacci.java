import java.util.*;                           // importing util package as it conatins scanner package
class Fibonacci{
	public static void main(String[] args) {

		int first, second, temp;
		first = 0;
		second = 1;
		temp =0;

		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter Range For Fibonacci Series");

		int range = number.nextInt();


		if (range == 0){
			System.out.println(first);
		
		}
		else if (range == 1){
			System.out.println(second);
		
	    }
		else {
			for (int i = 2; i <= range; i++)
			{
				temp = first + second;
				first = second;
				second = temp;
				System.out.println(temp);
			}
	
		}


	}
}