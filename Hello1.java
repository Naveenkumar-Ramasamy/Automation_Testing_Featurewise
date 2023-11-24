package org.tcs;

public class Hello1 {
	public static void main(String[] args) {
		// equal
		String d1="java";
	boolean equals = d1.equals("Java");
	System.out.println(equals);
	System.out.println(d1.equals("java"));
	// equal ignore
	String d2="GreensTechnology";
	boolean equalsIgnoreCase = d2.equalsIgnoreCase("GreensTechnology");
	System.out.println(equalsIgnoreCase);
	String d3="Java";
	boolean equalsIgnoreCase2 = d3.equalsIgnoreCase("java");
	System.out.println(equalsIgnoreCase);
	String d4="nisha";
	boolean equalsIgnoreCase3 = d4.equalsIgnoreCase("Nisha");
	System.out.println(equalsIgnoreCase3);
	System.out.println("----------------------------");
	// present or not
	String s1="velmurugank451@gmail.com";
	boolean contains = s1.contains("@");
	System.out.println(contains);
	String s2="nishakerala@gmail.com";
	System.out.println(s2.contains("@"));
	System.out.println("----------------------------");
	// replace
	String k1="welcome to java class";
	
	String replace = k1.replace("java", "sql");
	System.out.println(replace);
	
	String k2="greens Adiyar";
	String replace2 = k2.replace("Adiyar", "omr");
	System.out.println(replace2);
	String k3="welcome to java class";
	System.out.println(k3.replace( " ", "@"));
	String k4="nishakerala@gmail.com";
	System.out.println(k4.replace("gmail", "yahoo"));
	String k5="5-32-2a,venkatesh,nisha,aruppukotai,pincode-626101";
	System.out.println(k5.replace("pincode", "       "));
	System.out.println("----------------------------");
	// lower case
	String a1="NISHATHINI";
	System.out.println(a1.toLowerCase());
	String a2="NisathinI";
	System.out.println(a2.toLowerCase());
	System.out.println("----------------------------");
	// to upper
	String a3="kanmani";
	String upperCase = a3.toUpperCase();
	System.out.println(upperCase);
	String a4="kAnMani";
	System.out.println(a4.toUpperCase());
	System.out.println("----------------------------");
	// startsWith
	String w1="welcome to java class";
	boolean startsWith = w1.startsWith("welcome");
	System.out.println(startsWith);
	String w2= "hai i am nisha";
	System.out.println(w2.startsWith("welcome"));
	System.out.println("----------------------------");
	
	

	




}}
