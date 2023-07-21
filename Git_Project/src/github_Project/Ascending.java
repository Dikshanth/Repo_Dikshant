package github_Project;

import java.util.ArrayList;

public class Ascending {

	public static void main(String[] args) {
		 ArrayList <Integer> a = new ArrayList<>();
		    a.add(45);
		    a.add(23);
		    a.add(56);
		    a.add(89);
		    int temp;
		    for(int i=0;i<a.size();i++)
		    {
		    	for(int j=i+1;j<a.size();j++)
		    	{ 
		    		if(a.get(i)>a.get(j))
		    		{
		    			temp=a.get(i);
		    			a.set(i,a.get(j));
		    			a.set(j, temp);
		    			
		    		}
		    	}
		    }
		   
		    	System.out.print(a); 
		    }
			}



	


