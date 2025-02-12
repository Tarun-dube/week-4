package DynamicOnlineMarketplace;

public class BookCategory extends Category {
   private String author;
    public BookCategory(String categoryName, int price, String author) {
        super(categoryName, price);
        this.author = author;
    }
    void displayDetails() {
        System.out.println("Name: "+getCategoryName());
        System.out.println("Price: "+getPrice());
        System.out.println("Author: "+author);

    }
}
