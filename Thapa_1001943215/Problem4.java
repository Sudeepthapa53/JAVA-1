package language.concatenatedstring;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String string1 = data.nextLine();
        System.out.print("Enter String 2: ");
        String string2 = data.nextLine();
        System.out.print("Enter String 3: ");
        String string3 = data.nextLine();

        String stringCompine = string1 + string2;
        String stringCompineReverse = string2 + string1;
        if (stringCompine.equals(string3)) {
            System.out.println("Compare string 1+2 with string 3:");
            System.out.println("Output: They are equal");
        } else if (stringCompineReverse.equals(string3)) {
            System.out.println("Compare string 2+1 with string 3:");
            System.out.println("Output: They are also equal");
        } else {
            System.out.println("Compare string 2+1 or 1+2 with string 3:");
            System.out.println("Output: They are not equal");
        }

    }

}