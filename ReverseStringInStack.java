import java.util.*;

class ReverseStringInStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack <Character> stack = new Stack<>();
        
        String str=sc.nextLine();
        String reverse="";
        
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        
        while(!stack.isEmpty()){
            reverse+=stack.pop();
        }
        
        System.out.println(reverse);
    }
    
}