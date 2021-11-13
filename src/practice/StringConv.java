package practice;

import java.util.Scanner;

public class StringConv {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String strg= scan.nextLine();
		
		 char[] str = new char[strg.length()];
		 for (int i = 0; i < strg.length(); i++) { 
	            str[i] = strg.charAt(i); 
	        } 
	  
		 //char[] temp = new char[str.length()];
		 
		 for (int i = 0; i < strg.length(); i++) { 
			 if(str[i]>'a'&&str[i]<'z') {
				 str[i]=(char)(str[i]-32);
			 }else if (str[i]>'A'&&str[i]<'Z') {
				 str[i]=(char)(str[i]+32);
			 }
	        }
		 
		 String outStr = String.valueOf(str);
		 
		 System.out.println(outStr);
		 scan.close();
		 
	}
}
