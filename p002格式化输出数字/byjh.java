// package test;  

import java.util.Scanner;
public class byjh {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int i = 0;
		int a, b, c, m, n;
		while(i <= 100) {
			a = (x+i) % 10;
			b = (y+i) % 10;
			c = (z+i) % 10;
			m = a  * b * c;
			n = a  + b + c;
				
			if ((m==162) && (n==18)) {
				System.out.println(i);
				break;
			}
			i++;
		}
		if (i > 100) {
			System.out.println("so sad!");
		}
	}
}