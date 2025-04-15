import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        
        for(int i=1;i<11;i++){
            int n;
               n= x * i;
                System.out.printf("%d x %d = %d%n",x,i,n);
            }
    }
}
