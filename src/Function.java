import java.util.Scanner;

public class Function {
    public static void main(Test[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a String");
        String x = input.nextLine();
        String s = reverse(x);
        System.out.println(s);
    }
    //Write a asses modifer
    //Write a static
    // Return value
    //Name of the function
    //Parameters
    public static String reverse(String x){
        String s = new StringBuilder(x).reverse().toString();
            return s;

    }
}
