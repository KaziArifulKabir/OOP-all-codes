//using abstraction via abstract class 
abstract class ShapeArea {
    abstract void area();
}
class Circle extends ShapeArea {
void area() {
    double r = 10.5f;
    double Area = 3.1416*(r*r);
    System.out.println(Area);
}
}
class Triangle extends ShapeArea {
    void area() {
        double a = 10.5f;
        double b = 9.5f;
        double x = 0.5*(a*b);
        System.out.println(x);
    }
}
public class OOP_lab_work_3A {
public static void main(String[] args) {
    Circle A = new Circle();
    A.area();
    Triangle B = new Triangle();
    B.area();
}   
}