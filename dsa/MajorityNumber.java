package dsa;

public class MajorityNumber {
	static int findMajorityNumber(int[] array) {
		int num=array[0];
		int count =1;
		for(int i=1; i<array.length;i++) {
			if(num==array[i]) {
				count++;
				
			}
			else {
				count--;
				
			}
			if(count==0) {
				num=array[i];
				count=1;
			}	
			
		}
		if(count>=1) {
			return num;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
		int[] array2= { 3, 8, 3, 4, 3, 2, 2, 2, 2, 2, 2 };
		int a[] = { 1, 3, 3, 1, 2 };
		int arr[] = {2, 2, 2, 2, 5, 5, 2, 3, 3};
		System.out.println(findMajorityNumber(arr));

	}

}
