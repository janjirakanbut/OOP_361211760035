package lab5;

import java.util.Scanner;

public class ExArray2 {

    //user input data to array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x[] = new int[5];



        //for
        for (int i = 0; i < x.length; i++) {

            System.out.print("Enter an integer: ");
            x[i] = sc.nextInt();
        }

        //display data in Array
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //fori
        System.out.println("Data in Array");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        //foreach
        System.out.println("Data in Array");
        for (int val:x) { //อ่านค่าข้อมูลใน array ทีละตำแหน่งมาเก็บในตัวแปร val
            System.out.println(val);
        }

        showdataArray(x);
        showdata(x);
        show(x);


    }//main

    private static void show(int[] x) {
        int total= 0;
        for (int val:x) {
            total += val;
        }
        System.out.println("the total value in array"+total);
        System.out.println("the average value is: "+(total/x.length));
    }

    private static void showdataArray(int[] x) {
        System.out.println("Data in Array");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    private static void showdata(int[] x) {
        System.out.println("Data in Array");
        for (int val:x) { //อ่านค่าข้อมูลใน array ทีละตำแหน่งมาเก็บในตัวแปร val
            System.out.println(val);
        }
    }




}//class

