package dsa;
/*
There are N children standing in a line with some rating value. 
You want to distribute a minimum number of candies to these children such that: 
Each child must have at least one candy. The children with higher ratings will have 
more candies than their neighbors. 
You need to write a program to calculate the minimum candies you must give.
*/
public class Candies {
	static int candy(int[] ratings) {
		int res=0;
		int left[]=new int[ratings.length];
		int right[]=new int[ratings.length];
		left[0]=1;
		right[ratings.length-1]=1;
		//traverse through array of ratings to find if the left element has a 
		//lower element compared to the element
		for(int i=1;i<ratings.length;i++) {
			if(ratings[i-1]<ratings[i]) {
				left[i]=left[i-1]+1;
			}
			else {
				left[i]=1;
			}
		}
		//traverse through array of ratings to find if the right element has a 
		//lower element compared to the element
		for(int i=ratings.length-2;i>=0;i--) {
			if(ratings[i]>ratings[i+1]) {
				right[i]=right[i+1]+1;
			}
			else {
				right[i]=1;
			}
		}
		
		for(int i=0;i<ratings.length;i++) {
			res+=Math.max(left[i], right[i]);
		}
		
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ratings[] = {1,5,2,1};
		int result = candy(ratings);
		System.out.println(result);

	}

}
