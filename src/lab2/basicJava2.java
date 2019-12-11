package lab2;

import java.util.Scanner;

public class basicJava2 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name =sc.nextLine();
        System.out.println("your name is" + name );

        System.out.print("Enter your email:");
        String email =sc.nextLine();
        System.out.println("your email is" + email );

        System.out.print("Enter your Age:");
        String Age =sc.nextLine();
        System.out.println("your Age is" + Age );

        //input integer and floating
        System.out.print("Enter an number: ");
        int num =sc.nextInt();
        System.out.println("your enterred is" + num );

        System.out.print("Enter an number: ");
        double d =sc.nextDouble();
        System.out.println(d);




    }
}
