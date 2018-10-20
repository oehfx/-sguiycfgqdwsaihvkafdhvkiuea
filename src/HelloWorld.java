import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        long test = i.nextLong();
        long[] y = {9, 3, 5, 7, 2};
        while (test-- > 0) {
            long total = i.nextLong();
            long answer = 1;
            for (long j = 0; j < total; j++) {
                long m = i.nextLong();
                if (m % 2 != 0) {
                    m =(m-1) % 5;
                    answer = answer * y[(int)m];
                }

            }
            System.out.print(answer+"\n");
        }
    }
}