package dsa;

import java.util.Scanner;

/****************************************************************************\
 * One array of integers is given as an input ,which is initially increasing* 
 * and then decreasing or it can be only increasing or decreasing , 		*
 * you need to find the maximum value in the array in O(Log n) 				*
 * Time complexity and O(1) Space Complexity Asked in : AmazonMicrosoftUber	*
 * test array ={6,9,15,25,35,50,41,29,23,8}                                 *   
 \***************************************************************************/



public class MaxValueInArrayINCDEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {6,9,15,25,35,50,41,29,23,8};
		Scanner sc = new Scanner(System.in);
		int len=0;
		System.out.println("Enter the length of the array: ");
		len=sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the Array ");
		for(int i =0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println(arr);
		int e = arr.length-1;
		int s = 0;
		
		MaxValueInArrayINCDEC findmax = new MaxValueInArrayINCDEC();
		System.out.println(findmax.getMaxValue(arr, s, e));
	}
	public int getMaxValue(int arr[],int start,int end) {
		int mid;
		if(start == end) {
			
			return arr[start];
		}
		if(end == start+1) {
			
			if(arr[start]>arr[end]) {
				return arr[start];
			}
			else {
				return arr[end];
			}
		}
		mid= (start+end)/2;
		Boolean lgr = arr[mid]>arr[mid+1];
		Boolean rgl	= arr[mid]>arr[mid-1];
		if(lgr && rgl) {
			
			return arr[mid];
		}
		if(lgr && !(rgl)) {
			
			return getMaxValue(arr,start,mid-1);
		}
		else {
			
			return getMaxValue(arr,mid+1,end);
		}
		
		
	}

}
