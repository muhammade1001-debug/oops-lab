import java.io.*;
import java.util.*;
class Student {
    String name = "jeni";
    String batch = "MCA";
}
class Sports extends Student {
    String sports = "cricket";
}
class Result extends Sports {
    String result = "win";
    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student class: " + batch);
        System.out.println("Student participated in: " + sports);
        System.out.println("Sports result: " + result);
    }
}
class Score {
public static void main(String args[])
{
Result r = new Result();
r.display();
}
}
