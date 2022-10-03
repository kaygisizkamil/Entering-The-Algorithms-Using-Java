package sort;

public class ShellSort {
	
		public final static void sort(int []arr) {
				//we first need to spesify the gap there are some calculations for
				//that but to keep it simple we can use arr.length/2//declaring that variables in every execution of loop
				//does not make sense
				int j,gap,newElement;
				for(gap=arr.length;gap>0;gap/=2) {
					//in shell sort the loop executes til gap reach the 0
					//if the length is 6 first gap will be 3 ,the interval will be 3 
					//we'll compare them but not directly swapping them as we do insertion 
					//sort is kinda prefarable
					for( int i=gap;i<arr.length;i++){
						// iterate through the gap not the whole array
						 newElement=arr[i];
						 j=i;
						 while(j>=gap && arr[j-gap]>newElement) {
							 //supposedly we have an array that has elements 7,1,2
							 //the first element picked as 2
							 //and j is 1
							 arr[j]=arr[j-gap];
							 //decrement the j by gap
							 j-=gap;
							 //array becomes 1, ,2
							 //kinda overwritten but no need to worry the assignment at above
							 // has been done cuz of that we assigned arr[i] to temp is called newElement							 
							
						 }
						 //after exiting that loop the element we hold in newElement must be assigned to
						 //arr[j] as in insertion sort we are not swapping in every step
						 arr[j]=newElement;
					}
					
				}
				
		}

}
