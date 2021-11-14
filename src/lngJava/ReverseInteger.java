package lngJava;

public class ReverseInteger {
	public static void main(String args[]) {
		Integer i=4235322;
		System.out.println(reverseInteger(i));
		System.out.println(reverseIntegerTwo(i));
		System.out.println(reverseIntegerThree(i));
	}
	
	public static Integer reverseInteger(Integer data) {
		String newS = data.toString();
		String rev="";
		for (int i=newS.length()-1;i>=0;i--) {
			rev=rev+newS.charAt(i);
		}
		Integer x = Integer.parseInt(rev);
		return x;
	}
	
	public static int reverseIntegerTwo(int i) {
		int rev=0;
		while(i!=0) {
			rev = rev*10 +i%10;
			i=i/10;
		}
		return rev;
	}
	
	public static StringBuffer reverseIntegerThree(int i) {
		StringBuffer s = new StringBuffer(String.valueOf(i));
		s=s.reverse();
		return s;
	}
}
