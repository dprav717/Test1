package com.encapuslation;

public class Best {
    public static void main(String[] args)
    {
        /*String s1 = "java";
        s1= s1.concat(" rules");
 
        // Yes, s1 still refers to "java"
        System.out.println("s1 refers to " + s1);
        */
    	
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		Test t1= new Test();
		Test t2 = new Test();
		
//==  equals
		
		
	//	t1=t2;

		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		Test t3 = t2;
		if(s3 == s4) {
			
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}
		
		/*String s5 = new String(s1.concat("cool"));
		s3 = s3.concat(s5);
		
		
		  System.out.println("s1 refers to " + s1);
		  System.out.println("s1 refers to " + s2);
		  System.out.println("s1 refers to " + s3);
		  System.out.println("s1 refers to " + s4);
		  System.out.println("s1 refers to " + s5);*/
    }
  
}


