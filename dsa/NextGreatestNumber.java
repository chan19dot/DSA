package dsa;

import java.util.Arrays;

public class NextGreatestNumber {
	
	static int[] findNextGreatest(int array[]){
		int n=array.length;
		int i;
		for(i=n-1;i>0;i--) {
			if(array[i-1]<array[i]) {
				break;
			}
		}
		System.out.println(i);
		int element = i-1;
		int min=i+1;
		System.out.println(min);
		for(int j=i+1;j<n;j++) {
			if((array[j]>element)&&(array[j]<array[min])) {
				min=j;
			}
		}
		System.out.println(min);
		int temp =array[min];
		System.out.println(temp);
		array[min]=array[element];
		array[element]= temp;
		Arrays.sort(array,i,n);
		return array;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={2,1,8,7,6,5};
		int[] array1 =findNextGreatest(array);
		for(int i: array1) {
			System.out.print(i);
		}
	
		
	}

}
