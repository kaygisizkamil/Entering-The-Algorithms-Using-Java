package main;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=additional.GenerateArray.generateArr();		
		additional.PrintArray.print(arr,false);
		sort.BubbleSort.sort(arr);	
		additional.PrintArray.print(arr,true);
		

		arr=additional.GenerateArray.generateArr();	
		additional.PrintArray.print(arr,false);
		sort.SelectionSort.sort(arr);	
		additional.PrintArray.print(arr,true);
		
		

	}

}
