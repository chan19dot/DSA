package dsa;

public class CountingFrequencies {
	
	static int count(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]--;
			//System.out.print(array[i]);
		}
		
		for(int i=0;i<array.length;i++) {
			array[array[i]%array.length]=array[i]%array.length+array.length;
		}
		for(int i: array) {
			System.out.println(i/7);
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,2,7,7,5,5,2,2};
		count(a);

	}

}
