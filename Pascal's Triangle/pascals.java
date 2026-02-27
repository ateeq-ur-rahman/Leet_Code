import java.util.*;

public class pascals{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        List<List<Integer>> p=new ArrayList<>();
        for(int i=0;i<x;i++){
            if(i==0){
                p.add(new ArrayList<>());
                p.get(i).add(1);
            }
            else{
                p.add(new ArrayList<>());
                p.get(i).add(1);
                for(int j=1;j<i;j++){
                    p.get(i).add(p.get(i-1).get(j)+p.get(i-1).get(j-1));
                }
                p.get(i).add(1);
            }
        }
        System.out.println(p);
    }
}