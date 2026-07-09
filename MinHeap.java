import  java.util.*;

public class MinHeap
{
	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		Scanner sc=new Scanner(System.in);

		char ch;
		do {
			int n=sc.nextInt();
			heap.offer(n);
			System.out.println(" Do you want to add more:[Y/N] ");
			ch=sc.next().charAt(0);
		}

		while(ch=='Y' || ch =='y');

		System.out.print(heap);

	}
}