import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int preSum = 0;
            System.out.print(a + (Math.pow(2,i))*b);
            for(int j = 1; j<n; j++){
                double currSum =  preSum + (Math.pow(2,j))*b;
                int sum = (int) currSum; 
                preSum = preSum + sum;
                System.out.print(preSum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}