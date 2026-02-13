import java.util.*;

public class parenthesis{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of parenthesis:");
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);

            }
            else{
                if (stack.isEmpty()){
                    System.out.println("The parenthesis is not valid");
                    return;
                }

                char top=stack.pop();
                if(c==')' && top!='(' || c=='}' && top!='}' || c==']' && top!='['){
                    System.out.println("The parenthesis is not valid");
                    return;
                }   

            }
        }
        if (stack.isEmpty()){
            System.out.println("The parenthesis is valid");
        }
        else{
            System.out.println("The parenthesis is not valid");
        }
    }
}