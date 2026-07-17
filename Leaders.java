import java.util.Scanner;
class Leaders{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            int leader=arr[i];
            for(int j=i+ 1;j<size;j++){
                if(leader<arr[j]){
                    leader=arr[j];
                    break;
                }
            }
            if (leader==arr[i]){
                System.out.print(leader+" ");
            }
        }
       
        sc.close();
    }
}