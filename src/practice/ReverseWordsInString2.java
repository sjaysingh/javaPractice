package practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseWordsInString2 {
	public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> str = new ArrayList<String>();
	int n = Integer.parseInt(scan.nextLine());
//	System.out.println(n);
	while (scan.hasNext()){
	    int i=0;
	    str.add(scan.nextLine());
	    n=n-1;
	}
	
// 	for (int i=0;i<str.size();i++){
// 	    System.out.println(str.get(i));
// 	}
	for (String s:str){
	    System.out.println(reverseWord(s));
	}
	}
	
	public static String reverseWord(String s){
	    List<String> strTemp = new ArrayList<String>(Arrays.asList(s.split(".")));
	    int i=0;
	    StringBuffer finalStr = new StringBuffer("");
	    for (String strDiv: strTemp ){
	        System.out.println(strDiv);
	        if (i<1){
	            finalStr.append(strDiv);
	            i=i+1;
	        }
	        finalStr.append(strDiv + "." + finalStr);
	    }
	    return finalStr.toString();
	}
}