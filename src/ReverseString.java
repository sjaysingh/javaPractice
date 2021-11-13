import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String Str = s.nextLine();
		
		String StrNew = reverseString(Str);
		System.out.println(StrNew);
		s.close();
	}
	
	public static String reverseString(String Str) {
		StringBuilder Sb = new StringBuilder();
		char[] cStr = Str.toCharArray();
		for (int i=Str.length()-1;i>=0;i--) {
			Sb.append(cStr[i]);
		}
		String reverseStr = Sb.toString();
		return reverseStr;
	}
}
