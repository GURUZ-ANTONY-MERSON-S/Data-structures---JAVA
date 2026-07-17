import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        if(size<2){
            System.out.println(arr[0]);
            return;
        }
        else{
            for(int i=0;i<arr.length - 1;i++){
                for(int j=0;j<arr.length -1 - i;j++){
                    if(arr[j]>arr[j + 1]){
                        int temp=arr[j];
                        arr[j]=arr[j + 1];
                        arr[j + 1]=temp;
                    }
                }
            }
            
            for(int x:arr){
                System.out.print(x+" ");
            }
        }
        sc.close();
        
        
        
    }
}