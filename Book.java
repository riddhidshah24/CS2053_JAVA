public class Book {
    private String title;
    private String author;
    private double price;

        public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

        public void displayDetails() {
        System.out.println("Book Title : " + this.title);
        System.out.println("Author     : " + this.author);
        System.out.println("Price      : $" + this.price);
    }

      public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 15.99);
        Book book2 = new Book("1984", "George Orwell", 12.50);

       System.out.println("Book 1 Details:");
        book1.displayDetails();

       System.out.println("\nBook 2 Details:");
        book2.displayDetails();
    }
}
