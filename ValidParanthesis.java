import java.util.*;

class ValidParanthesis{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Stack <Character> stack = new Stack<>();
        
        String string=sc.nextLine();
        
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            else{
                char top=stack.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') ||(ch==']' && top!='[') ){
                    System.out.println("not a valid one");
                    break;
                }
            }
        }
        System.out.println(stack.isEmpty());
        
    }
}