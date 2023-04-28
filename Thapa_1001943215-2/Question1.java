import java.util.Scanner;

class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        int area = getLength() * getWidth();
        return area;
    }

    public int getPerimeter() {
        int peri = 2 * (getLength() + getWidth());
        return peri;
    }

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