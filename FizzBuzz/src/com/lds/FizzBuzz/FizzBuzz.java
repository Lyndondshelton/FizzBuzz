package com.lds.FizzBuzz;

public class FizzBuzz {
	
	public static void main(String[] args) {
		//loop through numbers 1-100
		for(int i=1; i<=100; i++) {
			//First check to see if the number is divisible by 3 or 5, if it is divisible by both 3 and 5 then print "FizzBuzz".
			if((i%3) == 0 && (i%5) == 0) {
				System.out.printf("FizzBuzz\n");
			}
			//check to see if the number is divisible by 5, if it is then print "Buzz".
			else if((i%5) == 0) {
				System.out.printf("Buzz\n");
			}
			//check to see if the number is divisible by 3, if it is then print "Fizz".
			else if((i%3) == 0) {
				System.out.printf("Fizz\n");
			}
			//If the number is not divisible by 3 or 5 then print the number.
			else {
				System.out.printf("%d\n",i);
			}
		}
	}

}
