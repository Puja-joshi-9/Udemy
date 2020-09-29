package budoKoAssignment;

import java.util.Scanner;

public class LargestSmallest {
	
	public static void main(String[] args) {
		
		int n=0 ,largest=0 , smallest=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements u want in array");
	     n = sc.nextInt();
		int A[] = new int[n];
		
		System.out.println("Enter the elements:");
		for(int i=0 ; i<n;i++) {
			
			A[i]=sc.nextInt();
		}

		//largest = A[0];
		for(int j=0 ; j<n ;j++) {
			if(A[j] > largest) {
			largest=A[j];
			
			}else 
				smallest=A[j];
			
		}
		System.out.println("The lagest number is :"+largest);
		System.out.println("The smallest number is :"+smallest);
	}

}
