package com.aurionpro.test;

import java.util.Arrays;

public class CommandLineTask {

	public static void main(String[] args) {
		
		int sum  = 0;
		int arr[] = new int[args.length];
		int n = args.length;                        // n = total no of elements
		int freq[] = new int[n];                   // array to store freq of element
		int counter, visited;
		for(int i=0;i<n;i++){		
				
			sum = sum + Integer.parseInt(args[i]);
			arr[i] = Integer.parseInt(args[i]);
			
		}
		
		System.out.println("Entered elements are:");
		for(int i=0;i<n;i++){		
			
			System.out.print(arr[i]+" " );
			
		}
		System.out.println();
		
		
		System.out.println("Sum of all elements:"+sum);
		float average = sum/n;
		
		System.out.println("Average of all elements:"+ average);
		
		
		Arrays.sort(arr);
		System.out.println("min value:-"+arr[0]);
		
		System.out.println("max value:-"+arr[n-1]);
		
		
		 if (n % 2 != 0)
			 System.out.println("Median:-"+arr[n/ 2]);  //if total elements are odd take middle value
		 
		 else    
			 System.out.println("Median:-"+(arr[(n - 1) / 2] + arr[n/ 2]) / 2.0 );  
		
		 
		visited =-1;
		for(int i =0; i<n;i++) 
		{
			
			counter =1;
			
			for(int j =i+1; j<n;j++)
			{
				
				if(arr[i] == arr[j])
				{
					counter++;
					freq[j]=visited;
				}
				
				
			}
			
			if(freq[i]!= visited)
			{
				freq[i] =counter;
			}
			
		}
		  
			System.out.println("Elements := Frequency");
		 	for(int i=0;i<freq.length;i++) {
		 		
		 		if(freq[i]!=visited)
		 		{
		 			
		 			System.out.println(arr[i]+ "        :=  " +freq[i]);
		 		}
		 	}
		 
	}

}
