import java.util.Scanner;
import java.util.Arrays;
class UniqueChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			boolean value=true;
			for(int j=0; j<str.length(); j++) {
				if(ch==str.charAt(j) && i!=j) {
					value=false;
					break;
				}
			}
			if(value) {
				System.out.print(ch+" ");
			}
		}
		sc.close();
	}
}