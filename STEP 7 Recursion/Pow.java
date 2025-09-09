class Pow {
    public static double myPow(double x, int n) {
        double ans = 1.0;
        double nn = n;
        if (nn < 0) {
            nn = -nn;
            x = 1 / x;
        }
        while (nn > 0) {
            if ((nn % 2) == 1) {
                ans *= x;
                nn = nn - 1;
            } else {
                x *= x;
                nn /= 2;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println(myPow(2,-2));
    }
}