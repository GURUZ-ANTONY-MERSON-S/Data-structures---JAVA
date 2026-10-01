import java.util.*;

class MoveZerosEnd {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		List<Integer> list= new ArrayList<>();

		int n=sc.nextInt();
		int arr[] = new int[n];

		int count=0;

		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]!=0) {
				list.add(arr[i]);
			}
			else {
				count++;
			}
		}

		for(int i=0; i<count; i++) {
			list.add(0);
		}

		for(int x: list) {
			System.out.print(x+" ");
		}
	}
}