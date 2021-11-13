package lngJava;

import java.util.Scanner;

public class VowelsAndConso {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String Str = s.nextLine();
		
		char[] chr = Str.toLowerCase().trim().toCharArray();
		
		int vow=0 , con =0;
		
		for (char c: chr) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y') {
				vow+=1;
			}else if(c!=' '){
				con+=1;
			}
		}
		System.out.println("The given string: "+ Str+" contains "+ vow+" vowels and "+con+" consonants" );
		s.close();
	}
}
