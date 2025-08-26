public class Madhu extends Student1{
    void display(){
        System.out.println("I am Kundan Kumar");
        super.display();
    }
    void study(){

    }
    //Method hiding
public static void main(String[] args) {
    Kundan k=new Kundan();
    k.display();
}
}