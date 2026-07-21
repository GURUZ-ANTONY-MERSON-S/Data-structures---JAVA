import java.util.Scanner;
class FirstNonRepeatingCharacter{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String string=sc.next();

		int freq[]=new int[26];

		for(int i=0; i<string.length(); i++) {
			char ch=string.charAt(i);
			freq[ch -'a']++;
		}


		for(int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			if(freq[ch - 'a'] == 1) {
				System.out.println(ch);
				return;
			}


		}
	}
}