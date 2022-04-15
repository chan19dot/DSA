package ch01;
import java.util.*;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		int l = s.length();
		//System.out.println(s);
		
		for (int i =0;i<l;i++) {
			int count =0;
			char t=s.charAt(i);
			for(char j:s.toCharArray()) {
				if(t==j) {
					//System.out.println(j);
					count++;
				}
			}
			
			if(count==1) {
				System.out.printf("Found %c",t);
				break;
			}
			
		}
		

	}

}
