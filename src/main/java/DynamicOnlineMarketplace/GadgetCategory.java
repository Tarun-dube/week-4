package DynamicOnlineMarketplace;

public class GadgetCategory extends Category {

    public GadgetCategory(String categoryName, int price) {
        super(categoryName, price);
    }
    void displayDetails() {
        System.out.println("Name: "+getCategoryName());
        System.out.println("Price: "+getPrice());

    }
}
