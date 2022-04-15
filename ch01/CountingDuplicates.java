package ch01;
import java.util.*;

public class CountingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		//System.out.println(s);
		sc.close();
		Map m = new HashMap();
		for(char i:s.toCharArray()) {
			if (m.containsKey(i)) {
				//int temp=0;
				int temp=(int)m.get(i);
				temp++;
				m.put(i,temp);
			}
			else {
				m.put(i, 1);
			}
		}
		int l = m.size();
		System.out.println(l);
		
		System.out.print(m);

	}

}
