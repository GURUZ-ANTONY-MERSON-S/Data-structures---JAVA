import java.util.Scanner;
class CountSquares{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        if(n<1){
            System.out.println("No elements.");
            return;
        }
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int value=0;
        int count=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                value=(int )Math.sqrt(arr[i]);
                if(value * value == arr[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}