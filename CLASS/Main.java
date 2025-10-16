import java.util.*;

class car{
    String brand;
    int year;

    void display(){
        System.out.println("brand: " + brand);
        System.out.println("year: " + year);
    }
}
public class Main{
    public static void main(String[] args) {
        car c1 = new car();
        c1.brand = "tata";
        c1.year = 2022;
        c1.display();
    }
}