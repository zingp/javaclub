// package test;
import java.util.Scanner;

public class PI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		double pi = 0;

		for(float i=0; i<=n; i++) {
			if (i % 2 == 0) { 
				pi +=  4 / (2 * i + 1);
			} else {
				pi -= 4 / (2 * i + 1);
			} 
		}
		System.out.println(pi);
  } 
}