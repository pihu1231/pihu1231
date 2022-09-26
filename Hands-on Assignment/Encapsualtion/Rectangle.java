// main class 
public class Rectangle{
    public static void main(String[] args) {
        // Create objects of shape:
        Shape s1 = new Shape();
        // set the value of s1 private field
        s1.setArea(24);
        s1.setName("Rectangle");
        s1.setPerimeter(34);
        // print the result of s1:
        System.out.println("Print the area:" +s1.getArea());
        System.out.println("Print The name: " +s1.getName());
        System.out.println("Print the Perimeter: " +s1.getPerimeter());
    }
}