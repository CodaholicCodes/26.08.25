
public class Student1 {
    void display(){
        System.out.println("This is a student class");
    }
    static void study(){
        System.out.println("Studying hard");
    }
}
class Topper extends Student1{
    void display(){
        System.out.println("This is a Topper class");
    }
    //Since not declared as static overrriden by subclass
    void study(){
        System.out.println("I study 18 hrs a day");
    }
}
class TestStatic{
    public static void main(String[] args) {
        Student1 stud=new Student1();
        stud.display();
        Student1 child=new Topper();
        child.display();
        study();  // This instance method cannot override the static method from student1
        
    }
}

