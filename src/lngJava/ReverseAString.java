package lngJava;

public class ReverseAString {
	public static void main(String args[]) {
		String str = "Selenium";
		System.out.println("Using CharAt() "+reverseString(str));
		System.out.println("Using StringBuilder "+reverseBuilder(str));
		System.out.println("Using StringBuffer "+reverseBuffer(str));
	}

	public static String reverseString(String str) {
		String rev="";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	
	public static StringBuilder reverseBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb=sb.reverse();
		return sb;
	}
	
	public static StringBuffer reverseBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb=sb.reverse();
		return sb;
	}

}
