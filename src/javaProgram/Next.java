package javaProgram;

import java.util.Scanner;

public class Next {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter No of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter No of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
		
		scanner.close();

	}

}
