package dsa;
/*
 * Matrix n*n is given, where all elements in any individual row or column are sorted. 
 * In such a matrix, we have to find
 * the position of a value in O(n) Time Complexity and O(1) Space Complexity
 * 
 * 
 * */



public class FindingNumberInSortedMatrix {
	public static void findNumber(int[][] array,int number) {
		int column = array[0].length -1;
		int row =0;
		boolean found = false;
		while(row<array[0].length && column >-1) {
			if(array[row][column]==number) {
				System.out.printf("The position is %d,%d",row,column);
				found = true;
				break;
			}
			if(array[row][column]>number) {
				column--;
				System.out.printf("column=%d\n",column);
			}
			else {
				System.out.printf("row=%d\n",row);
				row++;
			}
		}
		if(!found) {
			System.out.println("Not found!");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 10, 20, 30, 40 }, 
				{ 15, 25, 36, 46 }, 
				{ 28, 29, 37, 48 }, 
				{ 32, 33, 39, 50 } };
		int value = 32;
		findNumber(matrix,value);
	}

}
