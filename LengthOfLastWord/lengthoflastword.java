import java.util.*;

public class lengthoflastword{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        s=s.trim();
        String a[]=s.split(" ");
        System.out.println("The length of last word is:"+a[a.length-1].length());


    }
}