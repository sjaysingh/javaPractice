package lngJava;

import java.util.Arrays;

public class BubbleSort {
		public static void main(String[] args){
			BubbleSort sel = new BubbleSort();
			int[] arr = {100,38,88,23,5,15,1};
			sel.printArray(arr);
			sel.bubbSort(arr);
			sel.printArray(arr);
			
		}
		
		public int[] bubbSort(int[] arr) {
			//Selection Sort
			for (int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
			return arr;
		}
		
		public void printArray(int[] arr) {
			System.out.println(Arrays.toString(arr));
		}
}
