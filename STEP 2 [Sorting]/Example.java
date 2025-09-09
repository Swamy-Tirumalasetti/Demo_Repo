import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            int profit = 0;
            for (int j = i; j <= n-1; j++) {
                if (prices[i] < prices[j])
                    profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        if (maxProfit < 0)
            return 0;
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        int n = arr.length;
        int singleEle = maxProfit(arr);
        System.out.println("single ele is :" + singleEle);
    }
}