 public class Vehicle {
  String color,brand;
    int wheels;
    void drive(){
        System.out.println("Driving vehicle");
    }
    final void mySpeed(){
        System.out.println("My speed is 60km/hr");
    }
}
//Subclass

class Car extends Vehicle {
void mySpeed(){
    System.out.println("My speed is 80km/hr");
}
    //Method declared as final cannot be overridden in subclass
}

