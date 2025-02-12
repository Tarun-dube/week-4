package DynamicOnlineMarketplace;

public class ClothingCategory extends Category {
   private String brand;
    public ClothingCategory(String categoryName, int price, String brand) {
        super(categoryName, price);
        this.brand = brand;
    }
    void displayDetails() {
        System.out.println("Name: "+getCategoryName());
        System.out.println("Price: "+getPrice());
        System.out.println("Brand: "+brand);

    }
}
