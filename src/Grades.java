import java.util.Scanner;

public class Grades {
public static Scanner sc;
    public static void main(Test[] args)
    {
        int english, chemistry, computers, physics, maths;
        float total, Percentage;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter the Five Subjects Marks : ");
        english = sc.nextInt();
        chemistry = sc.nextInt();
        computers = sc.nextInt();
        physics = sc.nextInt();
        maths = sc.nextInt();

        total = english + chemistry + computers + physics + maths;
        Percentage = (total / 500) * 100;

        System.out.println(" Total Marks =  " + total);
        System.out.println(" Marks Percentage =  " + Percentage);

        if(Percentage >= 90)
        {
            System.out.println("\n Grade A");
        }
        else if(Percentage >= 80)
        {
            System.out.println("\n Grade B");
        }
        else if(Percentage >= 70)
        {
            System.out.println("\n Grade C");
        }
        else if(Percentage >= 60)
        {
            System.out.println("\n Grade D");
        }
        else if(Percentage >= 40)
        {
            System.out.println("\n Grade F");
        }
        else
        {
            System.out.println("\n Fail");
        }
    }
}