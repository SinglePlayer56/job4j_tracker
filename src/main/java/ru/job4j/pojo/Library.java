package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 120);
        Book harryPotter = new Book("Harry Potter", 200);
        Book theWitcher = new Book("The Witcher", 220);
        Book theLordOfTheRings = new Book("The Lord of the Rings", 278);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = harryPotter;
        books[2] = theWitcher;
        books[3] = theLordOfTheRings;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Name: " + book.getName() + " - Pages: " + book.getPages());
        }
        books[0] = theLordOfTheRings;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Name: " + book.getName() + " - Pages: " + book.getPages());
        }
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println("Name: " + book.getName() + " - Pages: " + book.getPages());
            }
        }
    }
}
