package AhmedAmr;

import java.util.Arrays;
import java.util.Scanner;


public class Java {
    public static void main(String[] args) {
//        System.out.println("Hello🖐️... enter your four arithmetic operations, please...");
//        for (int x = 0; x < 4; x++) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("enter your first number...");
//            int val1 = scanner.nextInt();
//            System.out.println("enter your second number...");
//            int val2 = scanner.nextInt();
//            System.out.println("enter your arithmetic operator...");
//            String val3 = scanner.next();
//
//            if (val3.equals("+")) {
//                System.out.println("(" + "'" + val3 + "'" + "," + val1 + "," + val2 + ")" + "--> " + (val1 + val2));
//            } else if (val3.equals("-")) {
//                System.out.println("(" + "'" + val3 + "'" + "," + val1 + "," + val2 + ")" + "--> " + (val1 - val2));
//            } else if (val3.equals("*")) {
//                System.out.println("(" + "'" + val3 + "'" + "," + val1 + "," + val2 + ")" + "--> " + (val1 * val2));
//            } else if (val3.equals("/")) {
//                System.out.println("(" + "'" + val3 + "'" + "," + val1 + "," + val2 + ")" + "--> " + (val1 / val2));
//            } else {
//                System.out.println("incorrect entry. The program will shut down. you can Try again... Thanks 😊 ");
//                break;
//            }
//        }

        Array arrita = new Array(5);
        arrita.add(52);
        arrita.add(67);
        arrita.add(24);
        arrita.add(89);
        arrita.add(32);
        arrita.Fill(10);
        arrita.Sort();
        arrita.print();
        arrita.RemoveFrom(2);
        arrita.IndexOF(4);


        }

    }
