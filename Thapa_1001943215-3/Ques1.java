import java.util.Scanner;

class Main{
    public static int getSize(int num){
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }

    public static int[] fillArray(int num,int[] intArray){

        int i = intArray.length;
        int temp=num;
        while (num > 0) {
            temp= num % 10;
            intArray[i-1] = temp;
            num = num / 10;
            i--;
        }
        return intArray;

    }

    public static boolean isPalindrome(int[] intArray){
        int n=intArray.length;
        boolean palindrome = true;


        for (int i = 0; i <= n / 2 && n != 0; i++) {


            if (intArray[i] != intArray[n - i - 1]) {
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter an Integer number or -99 to terminate:");
            int num = sc.nextInt();
            System.out.println();
            if(num == -99 ){
                break;
            }
            else{
                int size = getSize(num);
                System.out.println("Number of digits: "+size);
                System.out.println();

                int[] intArray = new int[size];

                intArray = fillArray(num,intArray);

                for (int i=0;i<size;i++){
                    System.out.println("The Number at "+i+" is "+intArray[i]);
                }

                System.out.println();

                if(isPalindrome(intArray)){

                    System.out.println("Number is a palindrome");
                    System.out.println();
                }
                else{
                    System.out.println("Number is not a palindrome");
                    System.out.println();
                }
            }
        }
    }
}
