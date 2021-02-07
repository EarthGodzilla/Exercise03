package com.company.BranchEason;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double a, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature");
        a = sc.nextDouble();
        System.out.println("The temperature is " + formatter.format((a-32)*5/9)+"degrees Celsius");
        if(a>-460){

        do {
            System.out.println("Enter  Fahrenheit temperature");
          a = sc.nextDouble();
           double f=  (a - 32) * 5 / 9;

            System.out.println("The temperature is " +formatter.format(f)+ "degrees Celsius");
        } while (a > -460);
        }

    }
}

