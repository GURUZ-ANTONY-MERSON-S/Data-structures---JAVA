import java.util.Scanner;
import java.util.Arrays;

class RotateLeft {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int size=sc.nextInt();
		int array[]=new int[size];
		
		if(size<1){
		    return;
		}

		for(int i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
        int k=sc.nextInt();
        if(k>size){
            k%=size;
        }
		int left=0;
		int right=array.length - 1;

		while(left<right) {
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;

			left++;
			right--;
		}

		right=array.length - 1;
		left= array.length - k;
		while(left<right) {
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;

			left++;
			right--;
		}

		left=0;
		right= array.length - k - 1;
		while(left<right) {
			int temp=array[right];
			array[right]=array[left];
			array[left]=temp;

			left++;
			right--;
		}
		
		for(int i: array){
		    System.out.print(i+" ");
		}
		sc.close();
	}
}