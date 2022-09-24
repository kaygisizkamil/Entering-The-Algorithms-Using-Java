package sort;

public class InsertionSort {
		public static void sort(int []arr) {
			int j=0;
			int spesificElement;
			//24,19,18
			System.out.println("Here comes insertion sort");
			for(int i=1;i<arr.length;i++) {
				j=i-1;//to compare secon element of array with the first element
				// in the beginning assuming first is already sorted and the other part of arr is unsorted
				spesificElement=arr[i];
				while(j>=0 && arr[j]>spesificElement) {
					arr[j+1]=arr[j];//shift right to jth element if  i.th element is bigger than i-1.th element
					//do this as long as the condition is satisfied,control till first element
					// dont have to worry about swapping and overwriting element because we are already
					//holding the value of the element in spesificElement after while loop anded we can write 
					//that value to j+1.th index
					--j;
				}
				arr[j+1]=spesificElement;
					
				
			}
		}
}
