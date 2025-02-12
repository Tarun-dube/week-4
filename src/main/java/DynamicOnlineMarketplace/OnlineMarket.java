package DynamicOnlineMarketplace;

public class OnlineMarket {
    public static void main(String[] args) {
        //gadget category
        Product<GadgetCategory> gadgets=new Product<>();
        GadgetCategory g1=new GadgetCategory("mobile",100000);
        GadgetCategory g2=new GadgetCategory("pc",200000);
        gadgets.addCategory(g1);
        gadgets.addCategory(g2);
        gadgets.display();

        System.out.println("After discount :");
        DiscountManager.applyDiscount(g1,15);
        DiscountManager.applyDiscount(g2,25);
        gadgets.display();


        // clothing category
        Product<ClothingCategory> clothes=new Product<>();
        ClothingCategory c1=new ClothingCategory("shirts",1500,"gucci");
        ClothingCategory c2=new ClothingCategory("Kurtas",2000,"manyawar");
        clothes.addCategory(c1);
        clothes.addCategory(c2);
        clothes.display();
        System.out.println("After discount :");
        DiscountManager.applyDiscount(c1,10);
        DiscountManager.applyDiscount(c2,20);
        clothes.display();

        // book category
        Product<BookCategory>books=new Product<>();
        BookCategory b1=new BookCategory("fiction",1500,"tarun");
        BookCategory b2=new BookCategory("romance",2000,"bhavya");
        books.addCategory(b1);
        books.addCategory(b2);
        books.display();
        System.out.println("After discount :");
        DiscountManager.applyDiscount(b1,10);
        DiscountManager.applyDiscount(b2,20);
        books.display();


    }
}
