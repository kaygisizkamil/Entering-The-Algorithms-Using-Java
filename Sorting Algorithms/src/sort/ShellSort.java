package sort;

public class ShellSort {
	
		public final static void sort(int []arr) {
			
			for( int gap=arr.length/2;gap>0;gap/=2) {
				for(int i=gap;i<arr.length;i++) {
					int minTemp=arr[i];
					int j=i;
					while(j>=gap && arr[j-gap]>minTemp) {
						arr[j]=arr[j-gap];
						j-=gap;
					}
					arr[j]=minTemp;
				}
			}
		}

}
