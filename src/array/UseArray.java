package array;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		System.out.println("Please enter some numbers: ");
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[10];
		for(int i=0; i<10; i++) {
			numbers[i] = sc.nextInt();
		}
		for(int j=0; j<10; j++) {
			System.out.println(numbers[j]);
		}
		sc.close();
	}
		
}
