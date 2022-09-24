package additional;

public class PrintArray {
		public static void print(int []arr,boolean a) {
		     if(!a)System.out.print("Array before sorted: ");
		     else System.out.print("Array after sorted: ");
		     
				for(int i=0;i<arr.length;i++) {
					 System.out.print(arr[i]+" ");
				}
				System.out.println("\n");
			
		}
}
