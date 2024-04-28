package three.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complex number 1 (real and imaginary part) : ");
        double oneReal = sc.nextDouble();
        double oneImag = sc.nextDouble();
        MyComplex one = new MyComplex(oneReal, oneImag);
        System.out.println("Enter complex number 2 (real and imaginary part) : ");
        double twoReal = sc.nextDouble();
        double twoImag = sc.nextDouble();
        MyComplex two = new MyComplex(twoReal, twoImag);

        System.out.println();
        System.out.println("Number 1 is: "+one);
        System.out.println((one.isReal())? one + " is a pure real number" : one + " is NOT a pure real number");
        System.out.println((one.isImaginary())? one + " is a pure imaginary number" : one + " is NOT a pure imaginary number");

        System.out.println();
        System.out.println("Nuber 2 is:"+two);
        System.out.println((two.isReal())?two+" is a pure real number" : two + " is NOT a pure real number");
        System.out.println((two.isImaginary())?" is a pure imaginary number" : two + " is NOT a pure imaginary number");

        System.out.println();
        if (one.equals(two)) {
            System.out.println(one + " is equal to " + two);
        } else {
            System.out.println(one + " is NOT equal to " + two);
        }

        System.out.println(one + " + " + two + " = " + one.addNew(two));
    }
}
