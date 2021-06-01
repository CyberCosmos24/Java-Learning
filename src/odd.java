import java.util.Scanner;

public class odd {
    public static void main(Test[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");

        int n = input.nextInt();
        int i = 0;
        while (i < n) {
            if (i %2==0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }

    }
}
