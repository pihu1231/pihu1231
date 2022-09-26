//Program to demonstarte the example of encapsulation:
// Parent Class: 
 class Shape {
    // Field Members:
    private int area;   
    private String name;
    private int perimeter;
    // Method of field members:
    // Get function use to acess the method of private fields:
 public int getArea() {
    return area;
}
// Set function use  to the set the value of private fields:
 public void setArea(int area) {
    this.area = area;
}
 public String getName() {
     return name;
 }
public void setName(String name) {
     this.name = name;
 }
public int getPerimeter() {
    return perimeter;
}
public void setPerimeter(int perimeter) {
    this.perimeter = perimeter;
}
}