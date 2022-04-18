package dsa;

public class DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inpu0t = "abdeed";
		int[] Ascii = new int[257];
		for(char i: inpu0t.toCharArray()) {
			Ascii[(int) i] = -1;
		}
		
		for (int i=0;i<257;i++) {
			if(Ascii[i]==-1) {
				System.out.print((char)i);
			} 
		}

	}

}
