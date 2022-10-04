package faktoriyel;

public class Factorial {
					public static final int factorialCalculate(int num) {
						
						if(num==0) return 1;
						else return num*factorialCalculate(num-1);
					}
					public static String factorialPrint(int num) {
						if(num==1) return "1";
						else return num+"*"+factorialPrint(num-1);
						
					}
}
