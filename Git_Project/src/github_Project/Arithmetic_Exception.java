package github_Project;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		System.out.println("program started");
	    int a=10;
	    try {
	    System.out.println(a/0);
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println(e.getMessage());
	    }
	    System.out.println("Process");
	    System.out.println("Program End");
		}
	}


