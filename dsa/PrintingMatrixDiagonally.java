package dsa;

public class PrintingMatrixDiagonally {
	
	static void printDiagonal(int[][] array) {
		//First Half
		for(int row=0; row<array.length;row++) {
			
			int i=row;
			int column =0;
			while(i>=0) {
				System.out.print(array[i][column]);
				i--;
				column++;
			}
			System.out.print("\n");
			
		//Second Half	
		}
		for(int column=1;column<array[0].length;column++) {
			int row =array.length-1;
			int i = column;
			while(i<array[0].length){
				System.out.print(array[row][i]);
				row--;
				i++;
			}
			System.out.print("\n");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
		
		printDiagonal(array1);
	}
}
