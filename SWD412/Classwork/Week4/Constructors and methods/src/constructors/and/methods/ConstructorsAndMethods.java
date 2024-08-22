/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors.and.methods;

/**
 *
 * @author caitl
 */

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            price = price - (price * discountPercentage / 100);
            System.out.println("Discount applied: " + discountPercentage + "%");
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }
}


public class ConstructorsAndMethods {
    public static void main(String[] args) {
        // TODO code application logic here
        
         Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);

        System.out.println("Before applying discount:");
        book.displayDetails();

        book.applyDiscount(10);

        System.out.println("\nAfter applying discount:");
        book.displayDetails();
        
        
    }
    
}
