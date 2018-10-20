public class max {
    public static int a(int N) {
        int a = (int) Math.random() * N;
        return a;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double i = Math.random() * (N - 1);
        double j = Math.random() * N;
        int h = (int) Math.random() * 4;
        a(N);
        do {
            switch (h) {
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
            }
            for (int k = 0; k < b; k++) {
                System.out.println();


            }

        } while (j != 0);
    }
}


	



