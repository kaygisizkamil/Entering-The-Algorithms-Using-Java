package sort;

import additional.Swap;

public class SelectionSort {
	
	public final static void sort(int []arr) {
		
		int min;
		System.out.println("Here comes selection sort");
		for(int i=0;i<arr.length;i++) {
			 min=i;
			for(int j=i;j<arr.length-1;j++) {
				 if(arr[j]<arr[min]) min=j;
			}
			Swap.swap(arr,min,i);
			
		}
	}

}
