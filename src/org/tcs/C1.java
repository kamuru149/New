package org.tcs;
// Find the count of caps,small,number and special character in given string

public class C1 {
public static void main(String[] args) {
	String s="WelCome@123";
	
	
	for(int i=0; i<s.length();i++) {
		char c=s.charAt(i);
		 if(Character.isUpperCase(i) || Character.isLowerCase(i) || c=='@' || c=='u'){
			System.out.println(c);
		 }
		 else {
			 System.out.println(c);
		 }
	}
}
}
	

