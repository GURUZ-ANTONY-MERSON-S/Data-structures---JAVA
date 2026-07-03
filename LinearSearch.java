import java.util.Arrays;
import java.util.Scanner;

class LinearSearch{
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        
        int keyElement=sc.nextInt();
        boolean result=false;
        
        for(int i=0;i<size;i++){
            if(keyElement==array[i]){
                System.out.println("Key element found in the index "+i+".");
                result=true;
                break;
            }
        }
        if(!result){
            System.out.println("Element not found.");
        }
        sc.close();
    }
}