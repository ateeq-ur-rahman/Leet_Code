import java.util.*;

public class firstoccurenceofsubstring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String a=sc.nextLine();
        System.out.println("Enter Substring");
        String b=sc.nextLine();
        if((a.contains(b))){
            System.out.println(a.indexOf(b));
        }
        else{
            System.out.println("-1");
        }
}
}