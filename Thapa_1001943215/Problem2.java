package language.scanner2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number");
        num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }

    }
}

