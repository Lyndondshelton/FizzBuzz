package com.lds.FizzBuzz;

public class FizzBuzz {
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if((i%3) == 0 && (i%5) == 0) {
				System.out.printf("FizzBuzz\n");
			}else if((i%5) == 0) {
				System.out.printf("Buzz\n");
			}else if((i%3) == 0) {
				System.out.printf("Fizz\n");
			}else {
				System.out.printf("%d\n",i);
			}
		}
	}

}
