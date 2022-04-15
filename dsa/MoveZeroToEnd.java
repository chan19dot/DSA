package dsa;

public class MoveZeroToEnd {
	static void MoveZeroToEnd(int array[], int n) 
    { 
        //Try yourself
        //Write your Code Here
        /*int high =n;
        for(int i=n-1;i>-1;i--) {
        	if(array[i]==0) {
        		array[i]=array[high];
        		array[high]=0;
        		high--;
        	}
        	else{
        		high--;
        	}
        }*/
		int x=0;
		for(int i=0;i<n;i++) {
			if(array[i]!=0) {
				array[x++]=array[i];
				
			}			
		}
		System.out.println(x);
		while(x<n) {
			array[x]=0;
			x++;
		}
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,3,0,0,4,0,9}; 
        int n = array.length; 
        MoveZeroToEnd(array, n); 
        System.out.println("result is: "); 
        for (int i=0; i<n; i++) 
            System.out.print(array[i]+" "); 

	}

}
