import java.util.Scanner;
public class Number {
    public static void main(Test[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if (number > 0) {
            if (number %2==0)
            {
                System.out.println("The number is even");
            }
            System.out.println(" is positive number");
        } else if (number < 0) {
            System.out.println(" is negative number");
        } else {
            System.out.println(" is neither positive nor negative");
        }
    }

}
