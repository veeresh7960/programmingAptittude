package com.xworkz.starPatterns;

public class Pyramid {

	public static void main(String[] args) {

		int num = 6;
		
		for (int i = 0; i <=num; i++) {
			for (int j = 0; j <= num; j++) {
				if(i%2!=0||j<=(num/2+1)) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}
		
	}

}
