import java.util.Scanner;
import java.util.Arrays;

class RevArray{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        
        String words[]=string.split(" ");
        
        int left=0;
        int right=words.length - 1;
        
        while(left<right){
            String temp=words[left];
            words[left]=words[right];
            words[right]=temp;
            
            left++;
            right--;
        }
        
        String result=String.join(" ",words);
        System.out.print(result);
        
        sc.close();
        
    }
}