import java.io.*;
import java.util.*;

public class Product {

    int pcode;
    String pname;
    double price;

    void data(int a, String b, double c) {
        pcode = a;
        pname = b;
        price = c;
    }

    void display() {
        System.out.println(pname + ", " + price + ", " + pcode);
    }

    static void lowestprice(double p1, double p2, double p3) {
        if (p1 <= p2 && p1 <= p3) {
            System.out.println("Apple has the lowest price");
        } else if (p2 <= p1 && p2 <= p3) {
            System.out.println("Orange has the lowest price");
        } else {
            System.out.println("Grape has the lowest price");
        }
    }

    public static void main(String[] args) {

        Product obj1 = new Product();
        Product obj2 = new Product();
        Product obj3 = new Product();

        obj1.data(101, "Apple", 78.50);
        obj2.data(102, "Orange", 40.00);
        obj3.data(103, "Grape", 30.00);

        obj1.display();
        obj2.display();
        obj3.display();

        Product.lowestprice(obj1.price, obj2.price, obj3.price);
    }
}



