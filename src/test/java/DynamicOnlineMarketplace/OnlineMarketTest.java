package DynamicOnlineMarketplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlineMarketTest {
    @Test
    public void addItemCategoryTest(){
        Product<GadgetCategory> gadgets=new Product<>();
        GadgetCategory g1=new GadgetCategory("mobile",102030);
        gadgets.addCategory(g1);

        assertEquals(1,gadgets.getList().size());
        assertTrue(gadgets.getList().contains(g1));
    }
    @Test
    public void discountTest(){
        Product<GadgetCategory> gadgets=new Product<>();
        GadgetCategory g1=new GadgetCategory("mobile",102030);
        gadgets.addCategory(g1);
        DiscountManager.applyDiscount(g1,10);
        assertEquals(91827,gadgets.getList().get(0).getPrice());
    }

}