package lngJava;

public class RemoveJunkString {
	public static void main(String args[]) {
		String str = "平仮名89sas漢9er0字ty";
		System.out.println(removeJunk(str	));
	}
	
	public static String removeJunk(String str) {
		String newS = str.replaceAll("[^a-zA-Z0-9]", "");
		return newS;
	}
}
