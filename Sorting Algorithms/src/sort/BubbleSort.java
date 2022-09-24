package sort;

import additional.Swap;

public class BubbleSort {
		public static void sort(int arr[]) {
			boolean swapped=false;
			System.out.println("Here comes bubble sort");
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						Swap.swap(arr, j+1, j);
						swapped=true;
					}							
				}
				if(!swapped) break;		
			}
		}
}
