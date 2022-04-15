package dsa;

public class LeftisLessRightisMore {
	static int findElement(int array[],int length_of_array){
		int left[] = new int[length_of_array];
		left[0]=array[0];
		int right=array[length_of_array-1];
		for(int i=1;i<length_of_array;i++) {
			left[i]= Math.max(left[i-1], array[i-1]);
		}
		for(int i=length_of_array-1;i>=0;i--) {
			if((left[i]<array[i])&&(right>array[i])) {
				return i;
			}
			right = Math.min(array[i], right);
			System.out.println(right);
		}
		
        return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={5, 1, 4, 3, 6, 8, 10, 7, 9};
	    int n= array.length;
	    findElement(array,n);
	    System.out.print(findElement(array,n));

	}

}
