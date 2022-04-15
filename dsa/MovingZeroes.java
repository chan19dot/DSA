package dsa;

public class MovingZeroes {
	static void movenum(int array[], int n){
		
		int low=0;
		int high=n-1;
		int mid =0;
		while(mid<high) {
			if(array[mid]==2) {
				array[mid]=array[high];
				array[high]=2;
				high--;
				//mid++;->you don't know which number was swapped back hence, no incrementing 
			}
			else if (array[mid]==0) {
				array[mid]= array[low];
				array[low]=0;
				low++;
				mid++;
			}
			else {
				mid++;
			}
		} 
	}
	public static void main(String[] args) {
		int array[] = {1,1,1,1,1,1,0,0,0,0,2,0,0,2,0,2}; 
		int n = array.length; 
		movenum(array,n);
		for(int i=0;i<n;i++) {
			System.out.print(array[i]);
		}
	}
}
