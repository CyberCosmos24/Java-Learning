public class Numberloop {
    public static void main(Test args[]) {
        int n = 100;
        System.out.print("Even Numbers from 1 to "+n+" are: ");
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

