/*
Here, we will learn how  to take input of a string that comprises of multiple words. Also, we will learn to clear the input buffer. 
Your task is to take input of strings and integers and produce the output. We must be clear with next() and nextLine()*/

class Geeks {
	static void getInput () {
		
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt(); //Taking the number of testcases
	    while(t-->0)
	    {
    		 int a = sc.nextInt(); 
    		 sc.nextLine();
    	    String s =sc.nextLine();
    	    
    	    //Your code here
    
    		System.out.println(a);
    		System.out.println(s);
	    }
	
	}
}
