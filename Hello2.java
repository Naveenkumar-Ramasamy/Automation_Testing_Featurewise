package org.tcs;

public class Hello2 {
	public static void main(String[] args) {
		
	
	// ends with
		String f1="welcome to java class";
		boolean endsWith = f1.endsWith("class");
		System.out.println(endsWith);
		String f2="welcome to java class";
		System.out.println(f2.endsWith("java"));
		System.out.println("------------------------------------");
		// empty
		String h1="welcome to java class";
		boolean empty = h1.isEmpty();
		System.out.println(empty);
		String h2="";
		System.out.println(h2.isEmpty());
		System.out.println("------------------------------------");
		// literal String
		String r1="Nisha";
		String r2="nisha";
		System.out.println(System.identityHashCode(r1));
		System.out.println(System.identityHashCode(r2));
		System.out.println("------------------------------------");
		// remove
		String l1="welcome";
		System.out.println(l1.replace("e", "@"));
		System.out.println("------------------------------------");
		// substring
		String e1="welcome to java class";
	System.out.println(e1.substring(2,10));
	String e2="kanmani";
	CharSequence subSequence = e2.subSequence(3, 6);
	System.out.println(subSequence);
		
		
		
		
		
		
	}
				
		
		
		
		
		
		
		

}
