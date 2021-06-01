import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(Test[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num %2==0)
        {
            System.out.println("the number is true");
        }
        else
        {
            System.out.println("the number is odd");
        }




        if (num %2==0)
        {
           if (num>100)
           {
               System.out.println("Number is even and greater than hundred");
           }
           else if (num<100)
            {
                System.out.println("Number is even and less than hundred ");
            }
           else
           {
               System.out.println("number is even but not greater than hundred");
           }

        }


    }
}
