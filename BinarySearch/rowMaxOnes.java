import java.util.* ;
import java.io.*;
public class rowMaxOnes {
    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int index = -1; int cnt_max = 0;
        for(int i =0;i<n;i++){
            int cnt_ones = m - lowerBound(mat.get(i),m,1);
            if(cnt_ones>cnt_max){
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

    static int lowerBound(ArrayList<Integer> arr,int n,int x){
        int low = 0; 
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    //Time and space : O(n * log2 m)- n rows, m cloumns && O(1)
      public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " +
        rowMaxOnes(matrix, n, m));
    }
}