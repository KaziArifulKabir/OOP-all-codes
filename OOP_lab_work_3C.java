interface ShapeArea {
    void area();
}
interface Circle extends ShapeArea {
    void area();
}
class new_Circle implements Circle{
   public  void area() {
        double r = 10.5f;
        double Area = 3.1416*(r*r);
        System.out.println(Area);
    }
}
interface Triangle extends ShapeArea {
    void area();
}
class new_Triangle implements Triangle {
    public  void area() {
        double a = 10.5f;
        double b = 9.5f;
        double x = 0.5*(a*b);
        System.out.println(x);
    }
}
public class OOP_lab_work_3C {
public static void main(String[] args) {
    new_Circle B = new new_Circle();
    B.area();
    new_Triangle C = new new_Triangle();
    C.area();
}   
}