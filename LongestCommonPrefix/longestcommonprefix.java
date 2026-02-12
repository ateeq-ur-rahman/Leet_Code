import java.util.*;

public class longestcommonprefix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of strings:");
        n=sc.nextInt();

        String [] a=new String[n];
        for (int i=0;i<n;i++){
            a[i]=sc.next();

        }

        for(int i=0;i<a[0].length();i++){ char c=a[0].charAt(i); boolean flag=true; for (int j=1;j<n;j++){ if (i>=a[j].length() || a[j].charAt(i)!=c){ flag=false; break; } } if (!flag){ System.out.println("Longest common prefix is: "+a[0].substring(0,i)); return; } } System.out.println("Longest common prefix is: "+a[0]);

    }
}