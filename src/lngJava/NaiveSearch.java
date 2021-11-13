package lngJava;

import java.util.Scanner;

public class NaiveSearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String txt = s.nextLine();
		String pat = s.nextLine();
		
		NaiveSearch nai = new NaiveSearch();
		nai.naive(pat, txt);
		
		s.close();
	}
	
	public void naive(String pat, String txt) {
		int n = txt.length();
		int m = pat.length();
		
		for (int i=0;i<n-m;i++) {
			int j;
			
			for (j=0;j<m;j++) {
				if (txt.charAt(i+j)!=pat.charAt(j)){
					break;
				}
			}
			if(j==m) {
				System.out.println("The pattern is present in the given text at index: "+i);
			}
		}
	}
}
