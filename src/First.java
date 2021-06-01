import java.util.Scanner;

public class First {
    public static void main(Test[] args) {
        System.out.println("hello world");
        Scanner input= new Scanner(System.in);
        String name1;
        String name2;
        System.out.println("enter your first name");
        name1=input.next();
        System.out.println("enter your last name");
        name2=input.next();
        String space=" ";
        String fullname=name1+space+name2;
        System.out.println(fullname);


    }
}
