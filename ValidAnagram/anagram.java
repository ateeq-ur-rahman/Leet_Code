import java.util.*;

public class anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String m=sc.nextLine();
        char arr1[]=n.toCharArray();
        char arr2[]=m.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}