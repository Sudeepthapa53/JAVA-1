import java.util.Scanner;

class Rectangle {
    private int length;
    private int width;

    /* Constructors */
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /* To calculate area of rectangle */
    public int getArea() {
        int area = getLength() * getWidth();
        return area;
    }

    /* To calculate perimeter of rectangle */
    public int getPerimeter() {
        int peri = 2 * (getLength() + getWidth());
        return peri;
    }

    /* Getters and Setters */
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        while (true) {
            System.out.println("Select menu:\n1 - to set the length\n" +
                    "2 - to set the width\n" +
                    "3 - to get the length\n" +
                    "4 - to get the width\n" +
                    "5 - to get the perimeter\n" +
                    "6 - to get the area\n" +
                    "0 - to quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    int length = scanner.nextInt();
                    rect.setLength(length);
                    break;
                case 2:
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();
                    rect.setWidth(width);
                    break;
                case 3:
                    System.out.println("Length is: " + rect.getLength());
                    break;
                case 4:
                    System.out.println("Width is: " + rect.getWidth());
                    break;
                case 5:
                    System.out.println("Perimeter is: " + rect.getPerimeter());
                    break;
                case 6:
                    System.out.println("Area is: " + rect.getArea());
                    break;
                case 0:
                    System.exit(0);
                default:
                    break;
            }
            System.out.println();
        }
    }
}