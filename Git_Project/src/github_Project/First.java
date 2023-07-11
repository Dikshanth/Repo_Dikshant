package github_Project;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a number");
		    int num = sc.nextInt();
		    int n=num,rev=0,mod;
		    while(n>0) {
		    	mod=n%10;
		    	rev=rev*10+mod;
		    	n=n/10;
		    }
		    System.out.println("The reverse of "+num+" is "+rev);
		    sc.close();
			}

		}

	


