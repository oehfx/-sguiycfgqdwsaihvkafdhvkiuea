import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int test = i.nextInt();
        while (test-- > 0) {
            int total = i.nextInt();
            int[] x = new int[total];
            int[] y = new int[total];
            int tmp = 0;
            for (int j = 0; j < y.length; j++) {
                x[j] = i.nextInt();
            }
            for (int k = 0; k < y.length; k++) {
                y[k] = k;
            }

            for (int f = 0; f < x.length; f++) {//第i趟

                for (int h = 0; h < x.length - 1; h++) {//第j个元素

                    if (x[h] > x[h + 1]) {

                        tmp = x[h];
                        x[h] = x[h + 1];
                        x[h + 1] = tmp;
                        tmp = y[h];
                        y[h] = y[h + 1];
                        y[h + 1] = tmp;
                    }

                }
            }

            for (int q = 0; q < total; q++) {
                System.out.print(y[q] + " ");
            }
            System.out.print("\n");


        }
    }
}