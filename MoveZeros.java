import java.util.Scanner;
import java.util.Arrays;

class MoveZeros{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        int array[]=new int[size];
        
        
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[j]=array[i];
                j++;
            }
        }
        
        for(int i=j ;i<array.length;i++){
            array[i]=0;
        }
        
        for(int x: array){
            System.out.print(x+" ");
        }
        sc.close();
    } 
}