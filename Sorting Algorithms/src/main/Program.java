package main;

import additional.PrintArray;
import faktoriyel.Factorial;

public class Program {
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[] arr=additional.GenerateArray.generateArr();	
		
	/*	additional.PrintArray.print(arr,false);
		sort.BubbleSort.sort(arr);	
		additional.PrintArray.print(arr,true);
		

		arr=additional.GenerateArray.generateArr();	
		additional.PrintArray.print(arr,false);
		sort.SelectionSort.sort(arr);	
		additional.PrintArray.print(arr,true);
		

		arr=additional.GenerateArray.generateArr();	
		additional.PrintArray.print(arr,false);
		sort.InsertionSort.sort(arr);	
		additional.PrintArray.print(arr,true);
		
		arr=additional.GenerateArray.generateArr();	
		additional.PrintArray.print(arr,false);
		sort.ShellSort.sort(arr);	
		additional.PrintArray.print(arr,true);*/
		System.out.println(Factorial.factorialPrint(5));
		System.out.println(Factorial.factorialCalculate(5));
		
		
		

	}

}
