package language.scanner3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer number: ");
        n = Integer.parseInt(sc.nextLine());
        int fac = 1;
        for(int i=1; i<=n; i++)
        {
            fac = fac * i;
        }
        System.out.print("Factorial of "+n+ " is " + fac);
    }
}


