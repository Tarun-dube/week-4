package DynamicOnlineMarketplace;

public class DiscountManager {
    public static <T extends Category> void applyDiscount(T product,double percent) {
        double discountAmount=product.getPrice()*percent/100;
        double newprice=product.getPrice()-discountAmount;
        product.setPrice(newprice);
        //System.out.println("The new price of "+product.getCategoryName()+" is "+newprice);
    }


}
