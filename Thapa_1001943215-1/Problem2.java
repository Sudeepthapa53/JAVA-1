import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Subject(s): ");

        int count = sc.nextInt();
        double totalMarks=0, percentage;

        System.out.println("Enter Marks of " + count +" Subject(s): ");


        for(int i=0; i<count; i++)
        {
            int mark = sc.nextInt();
            totalMarks += mark;
        }

        percentage = (totalMarks/(count*100)*100);

        char grade;

        switch((int)(percentage/10))
        {
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Total Marks: "+(int)totalMarks);
        System.out.println("Student Percentage: "+(int)percentage);
        System.out.println("Student Grade: "+grade);
    }
}