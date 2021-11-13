package lngJava;

import java.util.Scanner;

public class ReverseWordsInString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String Str = s.nextLine();
		
		String StrNew = reverseWords(Str);
		String StrNew1 = reverseEachWordInString(Str);
		System.out.println(StrNew);
		System.out.println(StrNew1);
		s.close();
	}
	
	public static String reverseWords(String Str) {
		String[] arr=Str.split(" ");
		StringBuilder Sb = new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			Sb.append(arr[i]);
			if(i!=0) {
				Sb.append(" ");
			}
		}
		return Sb.toString();
	}
	
	public static String reverseEachWordInString(String Str) {
		String[] arr=Str.split(" ");
		StringBuilder Sb = new StringBuilder();
		int i;
		for (String a:arr) {
			char[] astr = a.toCharArray();
			for(i = astr.length-1;i>=0;i--) {
				Sb.append(astr[i]);
			}
			if(i!=0) {
				Sb.append(" ");
			}
		}
		return Sb.toString();
	}
}
