package additional;

public class Swap {
	
	public static void swap(int[]arr,int index1,int index2) {
		int tmp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=tmp;
	}

}
