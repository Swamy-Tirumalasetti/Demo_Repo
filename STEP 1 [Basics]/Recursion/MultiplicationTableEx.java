public class MultiplicationTableEx {

    public static void table(int i,int n) {
        //int i = 1;
        if (i == 21)
            return;
        System.out.println(i + " * "+ n + " = " + (i * n));
       
        table(i+1, n);

    }

    public static void main(String[] args) {
        table(1,5);
    }
}