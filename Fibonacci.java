package week1.day2;

public class Fibonacci {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
			int num1=0,num2=1,range=8,i,sum=0;
		// Print first number
			System.out.println(num1);
		// Iterate from 1 to the range
			for(i=1;i<range;i++) 
			{
		// add first and second number assign to sum
				sum=num1+num2;
		// Assign second number to the first number
				num1=num2;
		// Assign sum to the second number
				num2=sum;
		// print sum
				System.out.println(sum);
			}
	}

}