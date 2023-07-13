package github_Project;

import java.util.Scanner;

public class Add_First_Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    System.out.println("Enter the Elements");
	    int arr[]=new int[size];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter element which you want to add at first index");
	    int ele=sc.nextInt();
	    for(int i=size-1;i>0;i--)
	    {
	    	arr[i]=arr[i-1];
	    }
	    arr[0]=ele;
	    for(int i=0;i<size;i++)
	    {
	      System.out.println(arr[i]);
		}
	    sc.close();

	}  
	}


