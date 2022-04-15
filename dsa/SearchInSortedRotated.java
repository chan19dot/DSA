package dsa;

public class SearchInSortedRotated {
	static int findNumber(int array[], int start, int end, int value) 
    { 
        if(start==end){
            return start;
        }
        if(end==start+1){
            if(value==array[end]){
                return end;
            }
            else{
                return start; 
            }
        }
        int mid = (start+end)/2;
        if(value==array[mid]){
            return mid;
        }
        //search if greater than start and then traverse from start to mid
        if(value>=array[start]){
            if(value>array[mid]){
                return findNumber(array,mid+1,end,value);
            }
            else{
                return findNumber(array,start,mid-1,value);
            }
        }
        else{
            
                return findNumber(array,mid+1,end,value);
            
            
        }
        //search if less than start then traverse from mid to end
        
        
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 3,4, 5, 6, 7, 8, 9,10, 1, 2}; 
        int n = array.length; 
        int value = 10; 
        int i = findNumber(array, 0, n - 1, value); 
        if (i != -1) 
            System.out.println("Index: " + i); 
        else
            System.out.println("Value not found"); 
		

	}

}
