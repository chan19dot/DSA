package dsa;

public class RemovingDuplicatesLinearTime {
	static int removeDuplicates(int array[], int n) {
		int a=array[0];
		int count=1;
		for(int i=1;i<n;i++) {
			if(array[i]>a) {
				a=array[i];
				array[count++]=a;
			}
		}
		return count;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,2,2,4,4,5,5,5};
		int n= array.length;
		int z=removeDuplicates( array,  n);
		for(int i=0;i<z;i++) {
			System.out.print(array[i]);
		}
	}

}
