import java.util.Scanner;
import java.util.Arrays;

class RemoveFirstOccChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String string =sc.next();
        char ch=sc.next().charAt(0);
        
       
        StringBuilder str=new StringBuilder(string);
        for(int i=0;i<string.length();i++){
            if(ch==str.charAt(i)){
                str.deleteCharAt(i);
                break;
            }
        }
        System.out.println(str.toString());
        sc.close();
    }
}