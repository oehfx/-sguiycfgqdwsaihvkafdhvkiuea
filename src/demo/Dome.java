package demo;


public class Dome {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int m = 7;
        int n = 9;

        int l;
        int k;
        int r;


        if (i > j)
            l = i;
        else
            l = j;
        if (m > n) {
            k = m;
        } else {
            k = n;

        }


    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;


        }
        return result;
    }
}
