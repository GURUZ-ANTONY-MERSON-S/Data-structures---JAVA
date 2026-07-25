import java.util.Scanner;
class CheckRotation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("Invalid string length.");
            return;
        }
        
        String result=str1+str1;
        
        if(result.contains(str2)){
            System.out.println("Yes they are the rotation of each other.");
        }
        else{
            System.out.println("No they are not the rotation of each other.");
        }
        
        sc.close();
    }
}