import java.util.Scanner;

public class GradeAverage {
    public static void main(Test[] args) {
        Test name;
        int mark1, mark2, mark3,mark4;
        double average;

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your grades");
        mark1 = input.nextInt();
        mark2 = input.nextInt();
        mark3 = input.nextInt();
        mark4 = input.nextInt();

        input.close();

        average = (double)  (mark1+mark2+mark3+mark4)/4;

        System.out.println(" your average for last semester is" + average);
    }
}
