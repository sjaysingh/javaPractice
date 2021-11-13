package lngJava;

import java.util.Arrays;

public class InsertionSort {
		public static void main(String[] args){
			InsertionSort sel = new InsertionSort();
			int[] arr = {100,28,99,2,5,15,1};
			sel.printArray(arr);
			sel.InsSort(arr);
			sel.printArray(arr);
			
		}
		
		public int[] InsSort(int[] arr) {
			//Selection Sort
			for (int i=1;i<arr.length;i++) {
				int key = arr[i];
				int j=i-1;
				while(j>=0 && arr[j]>key ) {
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j + 1] = key; 
			}
			
			return arr;
		}
		
		public void printArray(int[] arr) {
			System.out.println(Arrays.toString(arr));
		}
}
