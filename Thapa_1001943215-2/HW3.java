import java.util.Scanner;

public class Student {

    private String stdName;

    private int stdRollNo;

    private int stdId;

    public String getStdName() {

        return stdName;

    }

    public void setStdName(String stdName) {

        this.stdName = stdName;

    }

    public int getStdRollNo() {

        return stdRollNo;

    }

    public void setStdRollNo(int stdRollNo) {

        this.stdRollNo = stdRollNo;

    }

    public int getStdId() {

        return stdId;

    }

    public void setStdId(int stdId) {

        this.stdId = stdId;

    }

    public static void main(String[] args) {

        Student s=new Student();

        Scanner sc=new Scanner(System.in);

        System.out.print("Input Student Name: ");

        String n=sc.next();

        System.out.print("Input Student Roll no: ");

        int r=sc.nextInt();

        System.out.print("Input Student Id: ");

        int id=sc.nextInt();

        s.setStdName(n);

        s.setStdRollNo(r);

        s.setStdId(id);

        System.out.println();

        System.out.println("Student Name:"+s.getStdName());

        System.out.println(" Student RollNo:"+s.getStdRollNo());

        System.out.println("Student Id:"+s.getStdId());

    }

}