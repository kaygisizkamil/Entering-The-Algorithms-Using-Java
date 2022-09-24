package sort;

import additional.Swap;

public class SelectionSort {//unstable
	
	public final static void sort(int []arr) {
		
		int min,j;
		System.out.println("Here comes selection sort");
		for(int i=0;i<arr.length-1;i++) {
			 min=i;
			for(j=i;j<arr.length;j++) {
				//get the i.th element compare that element through the last element and dont swap till
				//find the smaller element than our elementarr[min] than do the swap
				 if(arr[j]<arr[min]) min=j;
			}
			Swap.swap(arr,min,i);
			
		}
	}

}
