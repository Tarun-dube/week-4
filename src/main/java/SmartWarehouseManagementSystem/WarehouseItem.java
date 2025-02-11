package SmartWarehouseManagementSystem;

public abstract  class WarehouseItem{


    String name;
    int quantity;

    public WarehouseItem(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }


}

class Electronics extends WarehouseItem{
   private int price;
    public Electronics( String name, int quantity, int price){
        super(name, quantity);
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
class Grocery extends WarehouseItem{
   private int price;
    public Grocery( String name, int quantity, int price){
        super(name, quantity);
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

}
class Furniture extends WarehouseItem{
    private int price;
    public Furniture( String name, int quantity, int price){
        super(name, quantity);
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

}
