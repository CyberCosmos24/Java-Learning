import java.util.Scanner;

public class Areaoftriangle
{
    public static void main(Test args[])
    {
        Scanner s = new Scanner (System.in);




        System.out.println("Enter the width of the Triangle:");
        int b= s.nextInt();

        System.out.println("Enter the height of the Triangle:");
        int h= s.nextInt();

       int g =area(b,h);
        System.out.println("Area of Triangle is: " + g);



    }
    public static int area(int b, int h){
       int x =  (b*h)/2;
       return x;
    }
}

