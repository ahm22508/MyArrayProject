package AhmedAmr;

import java.util.Scanner;

public class RunSequence {
    public static void main(String[] args){
        Sequence seq = new Sequence();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to create the Sequence");
        int FinalNumber = scan.nextInt();
        seq.ResolveSequence(FinalNumber);

    }
}
