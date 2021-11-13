package lngJava;

import java.util.Scanner;

public class LinAndBinSearch {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		int[] arr = {1,2,5,6,7,9,10,12};
		
		LinAndBinSearch menn = new LinAndBinSearch();
		
		//menn.linearSearch(arr,x);
		
		int r=arr.length;
		int l=0;
		//int result = menn.binarySearchRec(arr, l, r, x);
		int result = menn.binarySearchIter(arr, l, r, x);
		
		if(result==-1) {
			System.out.println(x+" is not present in the array");
		}
		else {
			System.out.println("The index where "+x+" is present is: "+result);
		}
		scan.close();
	}
	
	public void linearSearch(int[] arr, int x) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println(x+" is present at the following index in the array: "+ i);
				return;
			}
		}
		System.out.println(x+"is not present in the array");
	}
	
	public int binarySearchRec(int[] arr, int l, int r, int x){
		//Recursive
		if (r>=l) {
			int m = l+(r-l)/2;
			
			if(arr[m]==x) {
				return m;
			}
			else if (arr[m]<x) {
				return binarySearchRec(arr, m+1,r,x);
			}
			else {
				return binarySearchRec(arr,l,m-1,x);
			}
		}
		else return -1;
	}
	
	public int binarySearchIter(int[] arr, int l, int r, int x) {
		//Iterative
		while(l<=r) {
			int m = l+(r-l)/2;
			if(arr[m]==x) {
				return m;
			}
			else if (arr[m]<x) {
				l=m+1;
			}
			else  {
				r=m-1;
			}
		}
		return -1;
	}
}
