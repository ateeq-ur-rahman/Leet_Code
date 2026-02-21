import java.util.*;

public class Addbianry{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first binary number");
        String a=sc.next();
        System.out.println("Enter the second binary number");
        String b=sc.next();
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry==1){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;

        }
        System.out.println(sb.reverse());
    }
}