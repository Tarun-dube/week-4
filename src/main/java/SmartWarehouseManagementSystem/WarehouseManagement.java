package SmartWarehouseManagementSystem;

public  class WarehouseManagement {
    public static void main(String[] args) {
        Furniture f1=new Furniture("chair",2,500);
        Electronics e1=new Electronics("phone",2,5000);
        Grocery g1=new Grocery("rice",2,50);

        //create common storage
        Storage s=new Storage();
        s.add(f1);
        s.add(e1);
        s.add(g1);
        s.add(new Furniture("table",2,500));
        System.out.println("Item list in common Storage:");
        WarehouseUtil.displayItems(s.getItems());

        //furniture storage
        Storage<Furniture> furnitureStorage=new Storage();
        furnitureStorage.add(f1);
        furnitureStorage.add(new Furniture("table",2,500));
        furnitureStorage.add(new Furniture("bed",2,500));
        System.out.println("Furniture List:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());

        //Electronic storage
        Storage<Electronics> electronicsStorage=new Storage();
        electronicsStorage.add(e1);
        electronicsStorage.add(new Electronics("radio",2,3000));
        System.out.println("Electronics List:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        //Grocery Storage
        Storage<Grocery> groceryStorage=new Storage();
        groceryStorage.add(g1);
        groceryStorage.add(new Grocery("milk",2,60));
        System.out.println("Grocery List:");
        WarehouseUtil.displayItems(groceryStorage.getItems());


    }


}
