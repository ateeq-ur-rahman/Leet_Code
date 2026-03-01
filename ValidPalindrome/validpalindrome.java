import java.util.*;

public class validpalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else if(s.charAt(i)!=-s.charAt(j)){
                System.out.println("false");
                return;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println("true");
    }
}