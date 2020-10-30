// package test;
import java.util.Scanner;

public class wenduone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float F = input.nextFloat();
		float C;
		
		C = 5 * (F - 32) / 9;	

	 	System.out.println(Math.round(C));
	}
}
