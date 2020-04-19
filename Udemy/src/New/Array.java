package New;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		    int n, max, min;
		   
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of an array:");

			n = sc.nextInt();
			 int[] nums = new int[n];
			 System.out.println("Enter numbers:");
						
			for(int i=0;i<n;i++) {
				
				nums[i]= sc.nextInt();
				
			}
			max = nums[0];
			min = nums[0];
			
			for(int i=0;i<n;i++) {
				
				if(max<nums[i]) {
					
					max=nums[i];
					
				}else if(min>nums[i])
					
					min= nums[i];
				
			}
				
				System.out.println("max number is:"+max);
				System.out.println("Minimum number is:"+min);
			
			
			
			
			

	
		
	
		
	}

}
