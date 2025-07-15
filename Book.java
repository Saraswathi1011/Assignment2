package assignment2;

import java.util.Scanner;

class Book1 {
    private String name;
    private String author;
    private double price;
    private int qtyInStock;
    private char gender;
    private String mail;

  
    Book1(String name, String author, double price, int qtyInStock, char gender, String mail) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.mail = mail;
        this.gender = gender;
    }

    
    public String name() {
        return name;
    }

    public String author() {
        return author;
    }

    public double price() {
        return price;
    }

    public int qtyInStock() {
        return qtyInStock;
    }

    public char gender() {
        return gender;
    }

    public String mail() {
        return mail;
    }

    
    public String Print() {
        return "Book Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: Rs." + price + "\n" +
               "Quantity in Stock: " + qtyInStock + "\n" +
               "Author Email: " + mail + "\n" +
               "Author Gender: " + gender;
    }
}

public class Book {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Book Name: ");
        String name = sc.nextLine();
        
        System.out.print("Price:Rs. Marvels ");
        double price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        int qtyInStock = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("E-mail: ");
        String mail = sc.nextLine();

        System.out.print("Gender: ");
        char gender = sc.next().charAt(0);

     
        Book1 book = new Book1(name, author, price, qtyInStock, gender, mail);

   
        System.out.println(book.Print());
    }
}
