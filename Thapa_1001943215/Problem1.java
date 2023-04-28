package language.scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fname1 , fname2 , lname1 , lname2;
        int age1 , age2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name of person 1: ");
        fname1 = scan.nextLine();

        System.out.print("Enter last name of person 1: ");
        lname1 = scan.nextLine();

        System.out.print("Enter first name of person 2: ");
        fname2 = scan.nextLine();

        System.out.print("Enter last name of person 2: ");
        lname2 = scan.nextLine();

        System.out.print("Enter age of person 1: ");
        age1 = scan.nextInt();

        System.out.print("Enter age of person 2: ");
        age2 = scan.nextInt();

        System.out.println("\n\nFirst Person: " + lname1 + " , " + fname1 + " (" + age1 + ")");

        System.out.println("Second Person: " + lname2 + " , " + fname2 + " (" + age2 + ")");

        if(age1 < age2){
            System.out.println(lname1 + " is younger than " + lname2);
        }
        else if(age1 > age2){
            System.out.println(lname2 + " is younger than " + lname1);
        }
        else{
            System.out.println(lname1 + " is of same age as " + lname2);
        }

    }
}

