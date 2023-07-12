package github_Project;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a positive integer");
		    int n = sc.nextInt();
		    int mod,sum=0;
		    for(int i =1;i<=n;i++) {
		    	mod=n%i;
		    	if(mod==0) {
		    		sum++;
		    	}
		    }
		    if(sum==2) {
		    	System.out.println("The number "+n+ " is a prime number");
		    }
		    else {
		    	System.out.println("The number "+n+ " is not a prime number");
		    	sc.close();
		    }
			}

		}
	


