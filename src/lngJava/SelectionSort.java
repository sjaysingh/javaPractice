package lngJava;

import java.util.Arrays;

public class SelectionSort {
		public static void main(String[] args){
			SelectionSort sel = new SelectionSort();
			int[] arr = {100,28,99,2,5,15,1};
			sel.printArray(arr);
			sel.selecSort(arr);
			sel.printArray(arr);
			
		}
		
		public int[] selecSort(int[] arr) {
			//Selection Sort
			for (int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					int min =i;
					if (arr[j]<arr[min]) {
						min =j;
					}
					
					int temp = arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				}
			}
			
			return arr;
		}
		
		public void printArray(int[] arr) {
			System.out.println(Arrays.toString(arr));
		}
}
