package seleniumsessions;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="New World";
		String b="";
		// string index starts from 0 to s.length()-1
		for(int i=s.length()-1;i>=0;i--) {
			b=b+s.charAt(i);	
		}
		System.out.println("The String is:"+s);
		System.out.println("The Reverse of the String is:"+b);
	
		

	}

}
