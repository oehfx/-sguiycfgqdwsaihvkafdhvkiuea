package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int test = i.nextInt();
        while (test-- > 0) {
            int total = i.nextInt();
            int[] x = new int[total];
            int[] y = new int[total];
            for (int j = 0; j < y.length; j++) {
                x[j] = i.nextInt();
            }
            for (int k = 0; k < y.length; k++) {
                y[k] = k;
            }
            for (int l =0; l < x.length ; l++) {


                    if( x[l]<-1||x[l]>=total){
                        System.out.print("Invalid Input");
                     break;}
                if (x [l]== -1) {



                }
                }



            }


    }
}
