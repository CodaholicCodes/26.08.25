class Student {
    void display() {
        System.out.println("I am a Student");
    }
}

public class Kundan extends Student {
    void display() {
        System.out.println(" \n I am Kundan Kumar");
        super.display();
    }
    public static void main(String[] args) {
        Kundan k = new Kundan();
        k.display();
    }
}