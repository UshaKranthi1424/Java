package week1.day2;

public class PrimeNumber {
	
		/*
		 * Goal: To find whether a number is a Prime number or not
		 * 
		 * input: 13
		 * output: 13 is a Prime Number
		 * 
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
		 *   
		 * What are my learnings from this code?
		 * 1)
		 * 2)
		 * 3) 
		 * 
		 */
		public static void main(String[] args) {

			int num=13;
			int rem=0;
			for(int i=2 ; i<=num/2 ;++i)
			{
				if(num%i==0)
				{
					rem=1;
					break;
				}
			}		
				if(rem==0) 
				{
					System.out.println(num+" is a prime number .");
				}
				else
					System.out.println(num+" is not a prime number");
	   }

	}

