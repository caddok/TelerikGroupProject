package onlineshop.store;

public class Supplier {
    /*This Supplier class is for creating a supplier from whom we can restock the store if it is in low stock or no
     * stock in the store*/
    private String nameOfSupplier;

    public Supplier(String name) {
        setNameOfSupplier(name);
    }

    public String getNameOfSupplier() {
        return nameOfSupplier;
    }

    private void setNameOfSupplier(String nameOfSupplier) {
        this.nameOfSupplier = nameOfSupplier;
    }
}
