package DynamicOnlineMarketplace;

public abstract class Category {
   private String categoryName;
   private double price;

    public Category(String categoryName, double price) {
        this.categoryName = categoryName;
        this.price = price;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    abstract void displayDetails();
}
