package javaprogramming;

public class TypeProgs {
	
	  public static void main(String args[]) { 
	    byte b = 50; 
	    char c = 'a'; 
	    short s = 1024; 
	    int i = 1234; 
	    float f = 7.67f; 
	    double d = .6921; 
			
	    double result = (f / b) - (i / c) + (d * s); 
	   // The Expression 
			
	    System.out.println("result = " + result);  //Result after all the promotions are done 
	  } 
	} 


