import java.io.*;
import java.util.*;
class Publisher {
String name = "jeni";
}
class Book extends Publisher {
String bookname = "paulo";
}
class Literature extends Book {
String type = "literature";
}
class Fiction extends Book {
String type = "fiction";
}
class Library {
public static void main(String args[]) {
Literature ab = new Literature();
Fiction bc = new Fiction();
System.out.println("Fiction book details:");
System.out.println("Publisher name is: " + bc.name);
System.out.println("Book name is: " + bc.bookname);
System.out.println("Type is: " + bc.type);
System.out.println("\nLiterature book details:");
System.out.println("Publisher name is: " + ab.name);
System.out.println("Book name is: " + ab.bookname);
System.out.println("Type is: " + ab.type);
}
}
