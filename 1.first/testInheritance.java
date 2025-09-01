class Shape{
        void calculateArea(){
        System.out.println("Calculating area of shape");
    }
}

class Rectangle extends Shape {
    void calculateArea(int length,int breadth){
        System.out.println("Area of rectangle: "+(length*breadth));
    }

}

 class Circle extends Shape {
    void calculateArea(int radius){
        System.out.println("Area of circle: "+(3.14*radius*radius));
    }

}

public class testInheritance {
    public static void main(String[] args) {

        Circle cir=new Circle();
        cir.calculateArea();
        cir.calculateArea(5);
      Rectangle rec=new Rectangle();
      rec.calculateArea();
      rec.calculateArea(4,6);
    }
}

