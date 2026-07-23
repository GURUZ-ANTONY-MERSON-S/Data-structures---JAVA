import java.util.Scanner;
import java.util.Arrays;

class SortedOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        if(size<1){
            System.out.println("Invalid array size...");
            return;
        }
        
        int array[]=new int[size];
        
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        
        for(int i=1;i<size;i++){
            if(array[i]<array[i - 1]){
                System.out.println("The array is not sorted.");
                return;
            }
        }
        System.out.println("The array is sorted");
        
        sc.close();
    }
}