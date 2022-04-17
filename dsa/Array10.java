package dsa;



public class Array10 {
	/*
	 * 

This problem was asked by Amazon.
Given a sorted array, find the smallest positive integer 
that is not the sum of a subset of the array.
For example, for the input [1, 2, 3, 10], you should return 7.

Do this in O(N) time.
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,10};
		//sum of subset of array find the 
		//let first element be res check i'th 
		//element if less than or equal to res, then add the i'th element do this process
		//through out the array
		int res=input[0];
		for(int i=0;i<input.length;i++) {
			if(input[i]<=res) {
				res+=input[i];
			}
		}
		System.out.println(res);
		//use this when the array given is not sorted
		byte b=0b0;
		byte c =(byte) Math.pow(2,1);
		for(int i: input) {
			b= (byte) (b|b<<i|(byte)Math.pow(2, i-1));
		}
		
		String s = Integer.toBinaryString(b);
		int sres=s.length()+1;
		for(int i=s.length()-1;i>=0;i--) {
			if (s.charAt(i)=='0') {
				sres=i;
				break;
			}
		}
		System.out.print(sres);
		}
	}

		

