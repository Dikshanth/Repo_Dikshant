package github_Project;

import java.util.Scanner;

public class Perfect_nu {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    System.out.println("Enter any number");
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			if(n==sum) {
				System.out.println("The entered number is a perfect number");
			}
			else {
				System.out.println("The entered number is not a perfect number");
				sc.close();
			}
			
			}

	}


